package org.sio.jnetmap.web;

import org.sio.jnetmap.domain.Port;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/ports")
@Controller
@RooWebScaffold(path = "ports", formBackingObject = Port.class)
public class PortController {
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	  public String details(@RequestParam("idPort") String idPort, ModelMap model) {
		
		String strPortId= idPort;		
		if (strPortId != null) {		           
			Long portId = Long.parseLong(strPortId);		
			Port port = Port.findPort(portId);
			model.addAttribute("port", port);		
		}
		
		return "ports/details";
	}
}
