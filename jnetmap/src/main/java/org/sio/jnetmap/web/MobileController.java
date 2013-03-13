package org.sio.jnetmap.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/mobile/**")
@Controller
public class MobileController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    @ResponseBody
    public String index() {
    	StringBuilder st = new StringBuilder();
    	st.append(getUserName());
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
}
