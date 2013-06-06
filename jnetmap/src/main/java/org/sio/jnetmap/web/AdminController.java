package org.sio.jnetmap.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.input.SwappedDataInputStream;
import org.apache.commons.logging.Log;
import org.json.JSONArray;

import org.sio.jnetmap.domain.Band;
import org.sio.jnetmap.domain.Building;
import org.sio.jnetmap.domain.Modules;
import org.sio.jnetmap.domain.Switches;
import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Port;
import org.sio.jnetmap.domain.Room;
import org.sio.jnetmap.domain.Vlan;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RequestMapping("/uc/admin/**")
@Controller
public class AdminController {

	@RequestMapping(method = RequestMethod.POST, value = "{id}")
	public void post(@PathVariable Long id, ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response) {
	}
	
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public void index(ModelMap model) {
		
	}
	
	@RequestMapping(value = "updateswitchconnectionlist", method = RequestMethod.GET)
	  public void updateList( ModelMap model) {
		model.addAttribute("switches", Switches.findAllSwitcheses());
	}

	
	
	@RequestMapping(value = "updateswitchconnection", method = RequestMethod.GET)
	  public String details(@RequestParam("idNetSwitch") String idNetSwitch, ModelMap model) {
		
		String strOutletId= idNetSwitch;		
		if (strOutletId != null) {
		           
			Long netSwitchId = Long.parseLong(strOutletId);		
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
			List<Outlet> listUnpluggedOutlets = Outlet.findUnplugOutlets();
			List<Vlan> listVlansOfSwitch = Switches.findAllVlansBySwitch(netSwitchId);

			model.addAttribute("listOutletUnplugged",listUnpluggedOutlets);
			model.addAttribute("listOutletUnpluggedSize",listUnpluggedOutlets.size());
			model.addAttribute("mapPort",mapPort2);
			model.addAttribute("netSwitch",netSwitch);
			model.addAttribute("listModule",listModules);
			model.addAttribute("sizeModule", listModules.size());
			model.addAttribute("listVlansUntagged",listVlansOfSwitch);
		}
		return "uc/admin/updateswitchconnection";
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
	

	
}

class PortComparable implements Comparator<Port>{
	 
    @Override
    public int compare(Port p1, Port p2) {
    	int p1Num = Integer.parseInt(p1.getNum());
    	int p2Num = Integer.parseInt(p2.getNum());
        return (p1Num<p2Num ? -1 : (p1Num==p2Num ? 0 : 1));
    }
}

class KeyComparator<T> implements Comparator<Modules> {

	

	@Override
	public int compare(Modules m1, Modules m2) {
		
		int p1Num = Integer.parseInt(String.valueOf(m1.getNum()));
    	int p2Num = Integer.parseInt(String.valueOf(m2.getNum()));
        return (p1Num<p2Num ? -1 : (p1Num==p2Num ? 0 : 1));
		
	}

	}


