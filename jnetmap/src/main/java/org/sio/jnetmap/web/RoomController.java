package org.sio.jnetmap.web;

import java.util.HashMap;
import java.util.List;

import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Port;
import org.sio.jnetmap.domain.Room;
import org.sio.jnetmap.domain.Switches;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/rooms")
@Controller
@RooWebScaffold(path = "rooms", formBackingObject = Room.class)
public class RoomController {
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	  public String details(@RequestParam("idRoom") String idRoom, ModelMap model) {
		
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
		return "rooms/details";
	}
}
