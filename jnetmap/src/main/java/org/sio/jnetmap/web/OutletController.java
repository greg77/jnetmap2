package org.sio.jnetmap.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletResponse;

import org.sio.jnetmap.domain.Band;
import org.sio.jnetmap.domain.Dispatcher;
import org.sio.jnetmap.domain.Modules;
import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Port;
import org.sio.jnetmap.domain.Switches;
import org.sio.jnetmap.domain.Vlan;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RequestMapping("/outlets")
@Controller
@RooWebScaffold(path = "outlets", formBackingObject = Outlet.class)
public class OutletController {
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	  public String details(@RequestParam("idOutlet") String idOutlet, ModelMap model) {
		
		String strOutletId= idOutlet;		
		if (strOutletId != null) {		           
			Long outletId = Long.parseLong(strOutletId);		
			Outlet outlet = Outlet.findOutlet(outletId);
			
			//Port port = Port.findPort((long)outlet.getPort());			
			model.addAttribute("outlet", outlet);
			model.addAttribute("dispatchers", Dispatcher.findAllDispatchers());
			model.addAttribute("switcheses", Switches.findAllSwitcheses());
		}
		return "outlets/details";
	}
	
	
	
	@RequestMapping(value = "/updateOutlet/{idOutlet}/{idBand}", method = RequestMethod.PUT)
	  public @ResponseBody String updateOutlet(@PathVariable String idOutlet,@PathVariable String idBand, ModelMap model) {
		
		long outletIdLong = Integer.parseInt(idOutlet);
		long bandIdLong = Integer.parseInt(idBand);
		Outlet outlet = Outlet.findOutlet(outletIdLong);
		Band band = Band.findBand(bandIdLong);
		outlet.setBand(band);
		outlet.merge();
		
	
		return "ok";
	}
	
	@RequestMapping(value = "ajaxBands", method = RequestMethod.GET)
	  public @ResponseBody
	List<Band> ajaxBands(@RequestParam String dispatcherId) {
		List<Band> bands = new ArrayList<Band>();
		
		String strDispatcherId= dispatcherId;
		if (strDispatcherId != null) {
		            // TODO traiter le cas idRoom == 0
		Long dispatcherLongId = Long.parseLong(strDispatcherId);		
		bands = Band.findBandOfDispatcher(dispatcherLongId);
		
	
		}
		
		return bands;
	}
	
	
	
	//interface
	
	
	
	@RequestMapping(value = "updateoutletconnection/{idOutlet}/{idSwitch}", method = RequestMethod.GET)
	  public String updateoutletconnection(@PathVariable String idOutlet,@PathVariable String idSwitch ,ModelMap model) {
		long outletId;
				
		if (idOutlet != null && idSwitch != null) {
		    long netSwitchId = Integer.parseInt(idSwitch) ;
		    outletId = Integer.parseInt(idOutlet);
				
			Switches netSwitch = Switches.findSwitches(netSwitchId);	
			List<Port> ports = Port.findAllPortsBySwitch(netSwitchId);			
			HashMap<Modules, ArrayList<Port>> mapPort = new HashMap<Modules, ArrayList<Port>>();
			for (Port port : ports) {
				//System.out.println("port:"+port.getId()+ "module:"+port.getAModule().getNum());
				Modules netModule = port.getAModule();
				if (mapPort.containsKey(netModule)){
					mapPort.get(netModule).add(port);
				
					
				}
				else{
					ArrayList<Port> arrayPorts = new ArrayList<Port>();
					arrayPorts.add(port);
					mapPort.put(netModule, arrayPorts);
					
				}
			}
			for (ArrayList<Port> arrayListPort : mapPort.values()) {
				Collections.sort(arrayListPort, new PortComparable());
			}
			
			Map mapPort2 = doSort(mapPort);	
			
			
			List<Modules> listModules = Modules.findNetModuleByNetSwitch(netSwitchId);
			
			List<Vlan> listVlansOfSwitch = Switches.findAllVlansBySwitch(netSwitchId);

			model.addAttribute("currentOutlet", Outlet.findOutlet(outletId));
			model.addAttribute("mapPort",mapPort2);
			model.addAttribute("netSwitch",netSwitch);
			model.addAttribute("listModule",listModules);
			model.addAttribute("sizeModule", listModules.size());
			model.addAttribute("listVlansUntagged",listVlansOfSwitch);
		}
		return "outlets/updateoutletconnection";
	}
	
	
	@RequestMapping(value = "doUpdate/{idOutlet}/{idPort}", method = RequestMethod.GET)
	  public @ResponseBody String doUpdate(@PathVariable String idOutlet, @PathVariable String idPort,ModelMap model) {
		int portIntId = Integer.parseInt(idPort);
		int outletIntId = Integer.parseInt(idOutlet);
		Port port = null;
		Outlet outlet = Outlet.findOutlet((long) outletIntId);
		
		if (portIntId == 0){
			port = outlet.getPort();			
			port.setOutlet(null);
			outlet.setPort(null);
			
		}
		else{
			port = Port.findPort((long) portIntId);
			port.setOutlet(outlet);
			outlet.setPort(port);
		}
		
		Outlet newOutlet = outlet.merge();
		Port newPort = port.merge();
		
		
		
		Gson gson = new GsonBuilder()
      .setExclusionStrategies(new ExclusionStrategy() {

          public boolean shouldSkipClass(Class<?> f) {
              return false;
          }

          /**
            * Custom field exclusion goes here
            */
          public boolean shouldSkipField(FieldAttributes f) {
          	System.out.println(""+f.getDeclaredClass()+ " : "+ f.getName());
          	return (f.getDeclaredClass().equals(Outlet.class) && f.getName().equals("outlet"));
          }

       })
      /**
        * Use serializeNulls method if you want To serialize null values 
        * By default, Gson does not serialize null values
        */
      
      .create();
		
  	String json = gson.toJson(newOutlet);
  	StringBuilder st = new StringBuilder();
  	st.append(json);
      return st.toString();

	}
	
	public Map<Modules, ArrayList<Port>> doSort(Map<Modules, ArrayList<Port>> map) {
		 Comparator<Modules> comparator = new KeyComparator<Modules>();
		 Map<Modules, ArrayList<Port>> sortedMap = new TreeMap<Modules, ArrayList<Port>>(comparator);
		 sortedMap.putAll(map);
		 return sortedMap;
		}
	
	@RequestMapping(value = "updateOutlets", method = RequestMethod.PUT)
	public @ResponseBody
	String updateOutlets(@RequestBody String json, HttpServletResponse response){
		String[] jsonTable = json.split(",");
		int i =0;
		int jsontableLength = jsonTable.length;
		for (String anUpdate : jsonTable) {
				if (i < jsontableLength -1){
				String[] anUpdateTab = anUpdate.split(":");
				long idOutlet = (long) Integer.parseInt(anUpdateTab[0].trim());
				long idPort = (long) Integer.parseInt(anUpdateTab[1].trim());
				Outlet currentOutlet = Outlet.findOutlet(idOutlet);
				
				
				if (idPort == 0){
					currentOutlet.getPort().setOutlet(null);
					currentOutlet.setPort(null);	
				}
				else{
					
					Port currentPort = Port.findPort(idPort);					
					currentPort.setOutlet(currentOutlet);
					currentOutlet.setPort(currentPort);
					currentPort = currentPort.merge();
				}
				
				
				currentOutlet = currentOutlet.merge();
				
				i++;
				}
			
		}
		
		return "ok";		
	}
	
	@RequestMapping(value = "updateoutletconnectionsameswitch/{idOutlet}", method = RequestMethod.GET)
	  public String updateoutletconnectionsameswitch(@PathVariable String idOutlet,ModelMap model) {
		long outletId;
				
		if (idOutlet != null ) {			
		    outletId = Integer.parseInt(idOutlet);
		    Outlet currentOutlet = Outlet.findOutlet(outletId);
		    
				
			Switches netSwitch = currentOutlet.getPort().getAModule().getASwitch();	
			List<Port> ports = Port.findAllPortsBySwitch(netSwitch.getId());			
			HashMap<Modules, ArrayList<Port>> mapPort = new HashMap<Modules, ArrayList<Port>>();
			for (Port port : ports) {
				//System.out.println("port:"+port.getId()+ "module:"+port.getAModule().getNum());
				Modules netModule = port.getAModule();
				if (mapPort.containsKey(netModule)){
					mapPort.get(netModule).add(port);
				
					
				}
				else{
					ArrayList<Port> arrayPorts = new ArrayList<Port>();
					arrayPorts.add(port);
					mapPort.put(netModule, arrayPorts);
					
				}
			}
			for (ArrayList<Port> arrayListPort : mapPort.values()) {
				Collections.sort(arrayListPort, new PortComparable());
			}
			
			Map mapPort2 = doSort(mapPort);	
			
			
			List<Modules> listModules = Modules.findNetModuleByNetSwitch(netSwitch.getId());
			
			List<Vlan> listVlansOfSwitch = Switches.findAllVlansBySwitch(netSwitch.getId());

			model.addAttribute("currentOutlet", currentOutlet);
			model.addAttribute("mapPort",mapPort2);
			model.addAttribute("netSwitch",netSwitch);
			model.addAttribute("listModule",listModules);
			model.addAttribute("sizeModule", listModules.size());
			model.addAttribute("listVlansUntagged",listVlansOfSwitch);
		}
		return "outlets/updateoutletconnectionsameswitch";
	}
}
