package org.sio.jnetmap.web;

import java.util.ArrayList;

import org.sio.jnetmap.domain.Modules;
import org.sio.jnetmap.domain.Outlet;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/netmodules")
@Controller
@RooWebScaffold(path = "netmodules", formBackingObject = Modules.class)
public class NetModuleController {
	

}
