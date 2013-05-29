package org.sio.jnetmap.web;

import java.util.ArrayList;

import org.sio.jnetmap.domain.Modules;
import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Port;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/moduleses")
@Controller
@RooWebScaffold(path = "moduleses", formBackingObject = Modules.class)
public class ModulesController {
	
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	  public String details(@RequestParam("idModule") String idModule, ModelMap model) {
		
		String strModuleId= idModule;		
		if (strModuleId != null) {		           
			Long moduleId = Long.parseLong(strModuleId);		
			Modules netModule = Modules.findModules(moduleId);
			netModule.getASwitch();
			ArrayList<Outlet> listOutlets = (ArrayList<Outlet>) Outlet.findAllOutletsByModule(moduleId);	
			ArrayList<Port>	listPorts = (ArrayList<Port>) Port.findAllPortsByModule(moduleId);
			model.addAttribute("module", netModule);
			model.addAttribute("listPorts", listPorts);
			model.addAttribute("sizeListPorts", listPorts.size());
			model.addAttribute("listOutlets",listOutlets);
			model.addAttribute("sizeListOutlets", listOutlets.size());
		}
		return "moduleses/details";
	}
}
