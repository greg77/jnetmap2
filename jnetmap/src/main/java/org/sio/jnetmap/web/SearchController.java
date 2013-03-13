package org.sio.jnetmap.web;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.derby.iapi.store.raw.Corruptable;
import org.sio.jnetmap.domain.AdvancedSearch;
import org.sio.jnetmap.domain.Room;
import org.slf4j.impl.Log4jLoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;



@RequestMapping("/search/**")
@Controller
public class SearchController {



    @RequestMapping
    public String advancedSearch(ModelMap map) {    
    	    	
    	//map.addAttribute("listEntity",listEntity);
        return "search/advancedSearch";
    }
    
    @RequestMapping(value = "/getProperty", method = RequestMethod.GET)
    public @ResponseBody String getProperty(){
    	HashMap<String, HashMap<String, String>> listEntity = new HashMap<String,HashMap<String, String>>();
    	//String[] attributeOutlet = {"id"->"int", "num","port", "band"};
    	HashMap<String,String> attributeOutlet = new HashMap<String,String>();
    	attributeOutlet.put("id","int");
    	attributeOutlet.put("num","int");
    	attributeOutlet.put("port", "Port");
    	attributeOutlet.put("room", "Room");
    	attributeOutlet.put("band", "Band");
    	listEntity.put("Outlet", attributeOutlet);
    	
    	
    	//String[] attributePort = {"id", "num","AModule", "outlet", "vlanUntagged", "vlansTagged"};
    	HashMap<String,String> attributePort = new HashMap<String,String>();
    	attributePort.put("id", "int");
    	attributePort.put("num", "String");
    	attributePort.put("A_Module", "Modules");
    	attributePort.put("outlet", "Outlet");
    	attributePort.put("vlanUntagged", "Vlan");
    	attributePort.put("vlanstagged", "Vlan");
    	listEntity.put("Port", attributePort);
    	
    	
//    	String[] attributeModule = {"id", "num","ASwitch"};
    	HashMap<String,String> attributeModule = new HashMap<String,String>();
		attributeModule.put("id", "int");
		attributeModule.put("num", "String");
		attributeModule.put("A_Switch", "Switches");
		listEntity.put("Modules", attributeModule);
		
//		String[] attributeBuilding = {"id", "name"};
		HashMap<String,String> attributeBuilding = new HashMap<String,String>();
		attributeBuilding.put("id","int");
		attributeBuilding.put("name", "String");		
		listEntity.put("Building", attributeBuilding);
		
//		String[] attributeDispatcher = {"id", "name","building"};
		HashMap<String,String> attributeDispatcher = new HashMap<String,String>();
		attributeDispatcher.put("id", "int");
		attributeDispatcher.put("name", "String");
		attributeDispatcher.put("building", "Building");
		listEntity.put("Dispatcher", attributeDispatcher);
		
		
//		String[] attributeBand = {"id", "name", "building"};
		HashMap<String,String> attributeBand = new HashMap<String,String>();
		attributeBand.put("id", "int");
		attributeBand.put("name", "String");
		attributeBand.put("building", "Building");
		listEntity.put("Band", attributeBand);
		
//		String[] attributeProbe = {"id", "mac","num"};
		HashMap<String,String> attributeProbe = new HashMap<String,String>();
		attributeProbe.put("id", "int");
		attributeProbe.put("mac", "String");
		attributeProbe.put("num", "int");
		listEntity.put("Probe", attributeProbe);
		
//		String[] attributeRoom = {"id", "name","building"};
		HashMap<String,String> attributeRoom = new HashMap<String,String>();
		attributeRoom.put("id","int");
		attributeRoom.put("name", "String");
		attributeRoom.put("building", "Building");
		listEntity.put("Room", attributeRoom);
		
		//String[] attributeSwitches = {"id", "ip","name", "dispatcher"};
		HashMap<String,String> attributeSwitches = new HashMap<String,String>();
		attributeSwitches.put("id","int");
		attributeSwitches.put("ip","String");
		attributeSwitches.put("name", "String");
		attributeSwitches.put("dispatcher", "Dispatcher");
		listEntity.put("Switches", attributeSwitches);
		
//		String[] attributeVlan = {"id", "name", "num"};
		HashMap<String,String> attributeVlan = new HashMap<String,String>();
		attributeVlan.put("id","int");		
		attributeVlan.put("name", "String");
		attributeVlan.put("num", "String");
		listEntity.put("Vlan", attributeVlan);
		Gson gson = new Gson(); 
		String json = gson.toJson(listEntity); 
		return json;
    }
    
    
   
    @RequestMapping(value = "getResults", method = RequestMethod.POST)
    public  @ResponseBody String getResults (@RequestBody String json) throws ClassNotFoundException {
    	AdvancedSearch adv = AdvancedSearch.fromJsonToAdvancedSearch(json);
    	Class<?> typeCls = Class.forName("org.sio.jnetmap.domain."+adv.getType());
    	
    	HashMap<String, ArrayList<String>> items = new HashMap<String, ArrayList<String>>();
    	
    	ArrayList<String> itemBuilding = new ArrayList<String>();
    	itemBuilding.add("Building bui");
    	itemBuilding.add("bui");
    	items.put("building",itemBuilding);
    	
    	ArrayList<String> itemBand = new ArrayList<String>();
    	itemBand.add("Band ban");
    	itemBand.add("ban");
    	items.put("band", itemBand);
    	
    	ArrayList<String> itemDispatcher = new ArrayList<String>();
    	itemDispatcher.add("Dispatcher dis");
    	itemDispatcher.add("dis");
    	items.put("dispatcher", itemDispatcher);
    	
    	ArrayList<String> itemModules = new ArrayList<String>();
    	itemModules.add("Modules mod");
    	itemModules.add("mod");
    	items.put("A_Module", itemModules);
    	
    	ArrayList<String> itemOutlet = new ArrayList<String>();
    	itemOutlet.add("Outlet out");
    	itemOutlet.add("out");
    	items.put("outlet", itemOutlet);
    	
    	ArrayList<String> itemPort = new ArrayList<String>();
    	itemPort.add("Port por");
    	itemPort.add("por");
    	items.put("port", itemPort);
    	
    	ArrayList<String> itemRoom = new ArrayList<String>();
    	itemRoom.add("Room roo");
    	itemRoom.add("roo");
    	items.put("room", itemRoom);
    	
    	ArrayList<String> itemSwitches = new ArrayList<String>();
    	itemSwitches.add("Switches swi");
    	itemSwitches.add("swi");
    	items.put("A_Switch", itemSwitches);
    	
    	ArrayList<String> itemVlan = new ArrayList<String>();
    	itemVlan.add("Vlan vla");
    	itemVlan.add("Vlan vla");
    	items.put("vlan", itemVlan);   	
    	
    	ArrayList<String> requests = new ArrayList<String>();
    	ArrayList<String> jointures = new ArrayList<String>();
    	ArrayList<String> froms = new ArrayList<String>();
    	String type = adv.getType();
    	String minType = type.substring(0,3).toLowerCase();
    	froms.add(type+" "+minType);
    	
    	for (String requestValue : adv.getRequests()) {
    		String result = null;
    		ArrayList<String> corps = new ArrayList<String>();
    		String operator = null;
    		ArrayList<String> corpList = new ArrayList<String>();
    		if (requestValue.contains(">=")){
    			operator = ">=";
    			String[] requestValueSplitted = requestValue.split(">=");
    			for (String string : requestValueSplitted) {
					corpList.add(string);
				}
    			result = corpList.get(1);
    			if (corpList.get(0).contains(".")){    				
    				 String[] split = corpList.get(0).split(".");
    				 for (String string : split) {
						corps.add(string);
					}
    			}
    			else{
    				corps.add(corpList.get(0));
    			}
    		}
    		else if (requestValue.contains("<=")){
    			operator = "<=";
    			String requestValueSplitted[] = requestValue.split("<=");
    			for (String string : requestValueSplitted) {
					corpList.add(string);
				}
    			result = corpList.get(1);
    			if (corpList.get(0).contains(".")){    				
    				 String[] split = corpList.get(0).split(".");
    				 for (String string : split) {
						corps.add(string);
					}
    			}
    			else{
    				corps.add(corpList.get(0));
    			}
    		}else if (requestValue.contains("!=")){
    			operator = "!=";
    			String requestValueSplitted[] = requestValue.split("!=");
    			for (String string : requestValueSplitted) {
					corpList.add(string);
				}
    			result = corpList.get(1);
    			if (corpList.get(0).contains(".")){    				
    				 String split[] = corpList.get(0).split(".");
    				 for (String string : split) {
						corps.add(string);
					}
    			}
    			else{
    				corps.add(corpList.get(0));
    			}
    		}else if (requestValue.contains(">")){
    			operator = ">";
    			String requestValueSplitted[] = requestValue.split(">");
    			for (String string : requestValueSplitted) {
					corpList.add(string);
				}
    			result = corpList.get(1);
    			if (corpList.get(0).contains(".")){    				
    				 String[] split = corpList.get(0).split(".");
    				 for (String string : split) {
						corps.add(string);
					}
    			}
    			else{
    				corps.add(corpList.get(0));
    			}
    		}else if (requestValue.contains("<")){
    			operator = "<";
    			String requestValueSplitted[] = requestValue.split("<");
    			for (String string : requestValueSplitted) {
					corpList.add(string);
				}
    			result = corpList.get(1);
    			if (corpList.get(0).contains(".")){    				
    				 String[] split = corpList.get(0).split(".");
    				 for (String string : split) {
						corps.add(string);
					}
    			}
    			else{
    				corps.add(corpList.get(0));
    			}
    		}else if (requestValue.contains("=")){
    			operator = "=";
    			String requestValueSplitted[] = requestValue.split("=");
    			for (String string : requestValueSplitted) {
					corpList.add(string);
				}
    			result = corpList.get(1);
    			if (corpList.get(0).contains(".")){
    				String plop = corpList.get(0);
    				 String split[] = plop.split("\\.");
    				 for (String string : split) {
						corps.add(string);
					}
    			}
    			else{
    				corps.add(corpList.get(0));
    			}
    		}
    		
    	if (corps.size() == 1){
    		String request = minType+"."+corps.get(0)+" "+operator+ " "+ result;
    		requests.add(request);
    	}
    	else {
    		int i = 0;
    		for (String string : corps) {
    			if(i == corps.size()-1){
    				String request = items.get(corps.get(i-1)).get(1)+ "."+corps.get(i)+" "+operator+" "+result;
    				requests.add(request);
    			}
    			else{
    				String whereClause = "";
    				if (i == 0){
    					whereClause += minType+"."+string+" = "+items.get(string).get(1)+".id";
    					froms.add(items.get(string).get(0));
    				}
    				else{
    					whereClause += items.get(corps.get(i-1)).get(1)+"."+string+" = "+items.get(string).get(1)+".id";
    					froms.add(items.get(string).get(0));
    									
    				}
    				jointures.add(whereClause);
    			}
    			
    			
				i++;
			}
    	}
    			
			
		}
    	
    	removeDuplicate(froms);
    	removeDuplicate(jointures);
    	
    	String query = "SELECT ";
    	query += minType+ ".* FROM ";
    	String fromClause = "";
    	int iterFroms = 0;
    	for (String string : froms) {
			fromClause += string;
			if (iterFroms<froms.size()-1)
				fromClause += " , ";
			iterFroms++;
		}
    	query += fromClause+ " WHERE ";
    	String jointure = "";
    	int iterJointures = 0;
    	for (String string : jointures) {
			jointure += string;
			if (iterJointures<jointures.size()-1)
				jointure += " AND ";
			iterJointures++;			
		}
    	if (iterJointures > 0){
    		jointure += " AND ";
    	}
    	query += jointure+ "(";
    	String req = "";
    	int iterReq = 0;
    	for (String string : requests) {
			req += string;
			if (iterReq <= requests.size()-1)
				req += " "+adv.getOperators().get(iterReq)+" ";
			iterReq++;
			
		}
    	query += req+" )";
    	

    	
		
    	return query;
    
    }
    
    public static void removeDuplicate(ArrayList<String> arlList)
    {
     HashSet<String> h = new HashSet<String>(arlList);
     arlList.clear();
     arlList.addAll(h);
    }
}
