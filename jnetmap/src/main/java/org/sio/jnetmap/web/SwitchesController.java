package org.sio.jnetmap.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.sio.jnetmap.domain.Modules;
import org.sio.jnetmap.domain.Port;
import org.sio.jnetmap.domain.Switches;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/switcheses")
@Controller
@RooWebScaffold(path = "switcheses", formBackingObject = Switches.class)
public class SwitchesController {
	
	
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	  public String details(@RequestParam("idNetSwitch") String idNetSwitch, ModelMap model) {
		
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
			List<Modules> listModules = Modules.findNetModuleByNetSwitch(netSwitchId);
			
			
			model.addAttribute("mapPort",mapPort);
			model.addAttribute("netSwitch",netSwitch);
			model.addAttribute("listNetModule",listModules);
			model.addAttribute("sizeNetModule", listModules.size());
		}
		return "switcheses/details";
	}
}
