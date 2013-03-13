package org.sio.jnetmap.web;

import org.sio.jnetmap.domain.Switches;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/switcheses")
@Controller
@RooWebScaffold(path = "switcheses", formBackingObject = Switches.class)
public class SwitchesController {
}
