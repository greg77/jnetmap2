package org.sio.jnetmap.domain;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/probes")
@Controller
@RooWebScaffold(path = "probes", formBackingObject = Probe.class)
public class ProbeController {
}
