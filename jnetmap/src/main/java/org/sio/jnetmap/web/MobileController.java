package org.sio.jnetmap.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.cache.entry.StructuredMapCacheEntry;
import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Port;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RequestMapping("/mobile/**")
@Controller

public class MobileController {
	
	

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }
    
    @ResponseBody
    @RequestMapping(value="auth", method=RequestMethod.GET)
    public String auth(Model model)
    {
    	
    	StringBuilder st = new StringBuilder();
    	st.append("ok");
        return st.toString();
	
    }
    
    @ResponseBody
    @RequestMapping(value="test/{libelle}", method=RequestMethod.GET)
    public String test(Model model, @PathVariable String libelle)
    {
    	System.out.println("okio");
    	
    	StringBuilder st = new StringBuilder();
    	st.append(libelle);
        return st.toString();
		
        //get resource via someService and return to view
    }

    @ResponseBody
    @RequestMapping(value="code/{libelle}", method=RequestMethod.GET)
    public String getResource(Model model, @PathVariable String libelle)
    {
    	
    	String strLibelle[]=libelle.split("-");
    	String nameDispatcher = strLibelle[0];
    	String numBand = strLibelle[1];
    	String numPort = strLibelle[2];
    	Outlet currentOutlet = null;
    	try {
    		currentOutlet = getOutletWithSeparatedLibelle(nameDispatcher, numBand, numPort);
		} catch (Exception e) {
			StringBuilder st = new StringBuilder();
	    	st.append("noOutletFound");
	        return st.toString();
		}
    	
    	Gson gson = new GsonBuilder()
        .setExclusionStrategies(new ExclusionStrategy() {

            public boolean shouldSkipClass(Class<?> f) {
                return false;
            }

            /**
              * Custom field exclusion goes here
              */
            public boolean shouldSkipField(FieldAttributes f) {
            	System.out.println(""+f.getDeclaredClass()+ " : "+ f.getName());
            	return (f.getDeclaredClass().equals(Outlet.class) && f.getName().equals("outlet"));
            }

         })
        /**
          * Use serializeNulls method if you want To serialize null values 
          * By default, Gson does not serialize null values
          */
        
        .create();
    	String json = gson.toJson(currentOutlet);
    	StringBuilder st = new StringBuilder();
    	st.append(json);
        return st.toString();
		
        
    }
    

    
    private String getUserName() {
    	 Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	 String username;
    	 if (principal instanceof User) {
    	   username = ((User)principal).getUsername();
    	 } else {
    	   username = principal.toString();
    	 }
    	 return username;
    	}
    
    private Outlet getOutletWithSeparatedLibelle(String nameDispatcher, String numBand, String numPort){
    	Outlet outlet = Outlet.findOutletWithNumDispatcherNumBandNumPort(nameDispatcher, numBand, numPort);
    	return outlet;
    }
}
