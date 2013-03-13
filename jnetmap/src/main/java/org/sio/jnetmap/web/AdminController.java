package org.sio.jnetmap.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/uc/admin/**")
@Controller
public class AdminController {

	@RequestMapping(method = RequestMethod.POST, value = "{id}")
	public void post(@PathVariable Long id, ModelMap modelMap,
			HttpServletRequest request, HttpServletResponse response) {
	}

	@RequestMapping	
	public String index(ModelMap modelMap,WebRequest wr) {
		List<Building> buildings = Building.findAllBuildings();
		modelMap.addAttribute("buildings", buildings);
		modelMap.addAttribute("buildingsCount", buildings.size());
		String strBuildId = wr.getParameter("building");
		if (strBuildId != null) {
		            // TODO traiter le cas idBat == 0
		     Long buildId = Long.parseLong(strBuildId);
		
		List<Room> rooms = Room.findRoomsOfBuilding(buildId);
		modelMap.addAttribute("rooms", rooms);
		modelMap.addAttribute("roomsCount", rooms.size());
		}
		return "uc/admin/index";
	}
	
	@RequestMapping(value = "/ajaxRooms", method = RequestMethod.GET)
	  public @ResponseBody
	List<Room> ajaxRooms(@RequestParam String buildingId) {
		List<Room> rooms = new ArrayList<Room>();
		
		String strBuildId= buildingId;
		if (strBuildId != null) {
		            // TODO traiter le cas idBat == 0
		Long buildId = Long.parseLong(strBuildId);
		
		rooms = Room.findRoomsOfBuilding(buildId);
		
	
		}
		return rooms;
	}
	
	@RequestMapping(value = "/ajaxOutlets", method = RequestMethod.GET)
	  public @ResponseBody
	List<Outlet> ajaxOutlets(@RequestParam String roomId) {
		List<Outlet> outlets = new ArrayList<Outlet>();
		
		String strRoomId= roomId;
		if (strRoomId != null) {
		            // TODO traiter le cas idRoom == 0
		Long roomsId = Long.parseLong(strRoomId);		
		outlets = Outlet.findOutletOfRooms(roomsId);
		
	
		}
		
		return outlets;
	}
	
	@RequestMapping(value = "detailsOutlet", method = RequestMethod.GET)
	  public String detailsOutlets(@RequestParam("idOutlet") String idOutlet, ModelMap model) {
		
		String strOutletId= idOutlet;		
		if (strOutletId != null) {
		           
			Long outletId = Long.parseLong(strOutletId);		
			Outlet outlet = Outlet.findOutlet(outletId);			
			//Port port = Port.findPort((long)outlet.getPort());			
			model.addAttribute("outlet", outlet);
			//model.addAttribute("port",port);
		}
		return "uc/admin/detailsOutlet";
	}
	
	@RequestMapping(value = "detailsRoom", method = RequestMethod.GET)
	  public String detailsRoom(@RequestParam("idRoom") String idRoom, ModelMap model) {
		
		String strRoomId= idRoom;		
		if (strRoomId != null) {		           
			Long roomId = Long.parseLong(strRoomId);		
			Room room = Room.findRoom(roomId);
			List<Outlet> outlets= Outlet.findOutletOfRooms(roomId);
			HashMap<Switches, HashMap<Outlet, Port>> mapOutlet = new HashMap<Switches, HashMap<Outlet, Port>>();
			for (Outlet outletItem : outlets) {
				Port portItem = outletItem.getPort();
				Switches netSwitch = Switches.findSwitches(portItem.getAModule().getASwitch().getId());
				if (mapOutlet.containsKey(netSwitch)){
					mapOutlet.get(netSwitch).put(outletItem, portItem);
				}
				else{
					HashMap<Outlet, Port> newMapOutlet = new HashMap<Outlet, Port>();
					newMapOutlet.put(outletItem, portItem);					
					mapOutlet.put(netSwitch, newMapOutlet);
				}				
			}
			
			model.addAttribute("mapOutlet", mapOutlet);
			model.addAttribute("sizeOutlets", outlets.size());
			model.addAttribute("room", room);
			
		}
		return "uc/admin/detailsRoom";
	}
	
	@RequestMapping(value = "detailsSwitch", method = RequestMethod.GET)
	  public String detailsNetSwitch(@RequestParam("idNetSwitch") String idNetSwitch, ModelMap model) {
		
		String strOutletId= idNetSwitch;		
		if (strOutletId != null) {
		           
			Long netSwitchId = Long.parseLong(strOutletId);		
			Switches netSwitch = Switches.findSwitches(netSwitchId);	
			List<Port> ports = Port.findAllPortsBySwitch(netSwitchId);			
			HashMap<Modules, ArrayList<Port>> mapPort = new HashMap<Modules, ArrayList<Port>>();
			for (Port port : ports) {
				System.out.println("port:"+port.getId()+ "module:"+port.getAModule().getNum());
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
			List<Modules> listNetModule = Modules.findNetModuleByNetSwitch(netSwitchId);
			
			
			model.addAttribute("mapPort",mapPort);
			model.addAttribute("netSwitch",netSwitch);
			model.addAttribute("listNetModule",listNetModule);
			model.addAttribute("sizeNetModule", listNetModule.size());
		}
		return "uc/admin/detailsSwitch";
	}
	
	@RequestMapping(value = "detailsPort", method = RequestMethod.GET)
	  public String detailsPort(@RequestParam("idPort") String idPort, ModelMap model) {
		
		String strPortId= idPort;		
		if (strPortId != null) {		           
			Long portId = Long.parseLong(strPortId);		
			Port port = Port.findPort(portId);
			model.addAttribute("port", port);		
		}
		
		return "uc/admin/detailsPort";
	}
	
	@RequestMapping(value = "detailsModule", method = RequestMethod.GET)
	  public String detailsModule(@RequestParam("idModule") String idModule, ModelMap model) {
		
		String strModuleId= idModule;		
		if (strModuleId != null) {		           
			Long moduleId = Long.parseLong(strModuleId);		
			Modules netModule = Modules.findModules(moduleId);			
			ArrayList<Outlet> listOutlets = (ArrayList<Outlet>) Outlet.findAllOutletsByModule(moduleId);	
			model.addAttribute("netModule", netModule);
			model.addAttribute("listOutlets",listOutlets);
		}
		return "uc/admin/detailsModule";
	}
	
	@RequestMapping(value = "/test")
	public String test(){
		return "uc/admin/index";
	}
	
}
