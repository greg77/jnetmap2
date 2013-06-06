package org.sio.jnetmap.web;

import java.util.ArrayList;
import java.util.List;

import org.sio.jnetmap.domain.Band;
import org.sio.jnetmap.domain.Dispatcher;
import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Switches;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
			model.addAttribute("dispatchers", Dispatcher.findAllDispatchers());
			model.addAttribute("switcheses", Switches.findAllSwitcheses());
		}
		return "outlets/details";
	}
	
	
	
	@RequestMapping(value = "/updateOutlet/{idOutlet}/{idBand}", method = RequestMethod.PUT)
	  public @ResponseBody String updateOutlet(@PathVariable String idOutlet,@PathVariable String idBand, ModelMap model) {
		
		long outletIdLong = Integer.parseInt(idOutlet);
		long bandIdLong = Integer.parseInt(idBand);
		Outlet outlet = Outlet.findOutlet(outletIdLong);
		Band band = Band.findBand(bandIdLong);
		outlet.setBand(band);
		outlet.merge();
		
	
		return "ok";
	}
	
	@RequestMapping(value = "ajaxBands", method = RequestMethod.GET)
	  public @ResponseBody
	List<Band> ajaxBands(@RequestParam String dispatcherId) {
		List<Band> bands = new ArrayList<Band>();
		
		String strDispatcherId= dispatcherId;
		if (strDispatcherId != null) {
		            // TODO traiter le cas idRoom == 0
		Long dispatcherLongId = Long.parseLong(strDispatcherId);		
		bands = Band.findBandOfDispatcher(dispatcherLongId);
		
	
		}
		
		return bands;
	}
}
