package org.sio.jnetmap.web;


import org.sio.jnetmap.domain.Probe;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sondes")
@Controller
@RooWebScaffold(path = "sondes", formBackingObject = Probe.class)
public class SondeController {
}
