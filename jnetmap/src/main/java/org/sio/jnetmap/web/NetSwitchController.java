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

@RequestMapping("/netswitches")
@Controller
@RooWebScaffold(path = "netswitches", formBackingObject = Switches.class)
public class NetSwitchController {
	
	
}
