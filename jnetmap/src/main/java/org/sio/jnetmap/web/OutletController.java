package org.sio.jnetmap.web;

import org.sio.jnetmap.domain.Outlet;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
			//model.addAttribute("port",port);
		}
		return "outlets/details";
	}
}
