package org.sio.jnetmap.web;

import java.io.IOException;
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
import org.sio.jnetmap.domain.Band;
import org.sio.jnetmap.domain.Building;
import org.sio.jnetmap.domain.Dispatcher;
import org.sio.jnetmap.domain.Modules;
import org.sio.jnetmap.domain.Outlet;
import org.sio.jnetmap.domain.Port;
import org.sio.jnetmap.domain.Room;
import org.sio.jnetmap.domain.Switches;
import org.sio.jnetmap.domain.Vlan;
import org.slf4j.impl.Log4jLoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

@RequestMapping("/search/**")
@Controller
public class SearchController {

	@RequestMapping(value = "/advanced")
	public String advancedSearch(ModelMap map) {
		return "search/advancedSearch";
	}
	
	
	
	@RequestMapping
	public String index(ModelMap modelMap,WebRequest wr) {
		List<Building> buildings = Building.findAllBuildings();
		modelMap.addAttribute("buildings", buildings);
		modelMap.addAttribute("buildingsCount", buildings.size());
		String strBuildId = wr.getParameter("building");
		if (strBuildId != null) {
		   Long buildId = Long.parseLong(strBuildId);
		
		List<Room> rooms = Room.findRoomsOfBuilding(buildId);
		modelMap.addAttribute("rooms", rooms);
		modelMap.addAttribute("roomsCount", rooms.size());
		}
		return "search/index";
	}
	
	// json actions

	@RequestMapping(value = "/getProperty", method = RequestMethod.GET)
	public @ResponseBody
	String getProperty() {
		HashMap<String, HashMap<String, String>> listEntity = new HashMap<String, HashMap<String, String>>();
		// String[] attributeOutlet = {"id"->"int", "num","port", "band"};
		HashMap<String, String> attributeOutlet = new HashMap<String, String>();
		attributeOutlet.put("id", "int");
		attributeOutlet.put("num", "int");
		attributeOutlet.put("port", "Port");
		attributeOutlet.put("room", "Room");
		attributeOutlet.put("band", "Band");
		listEntity.put("Outlet", attributeOutlet);

		// String[] attributePort = {"id", "num","AModule", "outlet",
		// "vlanUntagged", "vlansTagged"};
		HashMap<String, String> attributePort = new HashMap<String, String>();
		attributePort.put("id", "int");
		attributePort.put("num", "String");
		attributePort.put("A_Module", "Modules");
		attributePort.put("outlet", "Outlet");
		attributePort.put("vlanUntagged", "Vlan");
		attributePort.put("vlanstagged", "Vlan");
		listEntity.put("Port", attributePort);

		// String[] attributeModule = {"id", "num","ASwitch"};
		HashMap<String, String> attributeModule = new HashMap<String, String>();
		attributeModule.put("id", "int");
		attributeModule.put("num", "String");
		attributeModule.put("A_Switch", "Switches");
		listEntity.put("Modules", attributeModule);

		// String[] attributeBuilding = {"id", "name"};
		HashMap<String, String> attributeBuilding = new HashMap<String, String>();
		attributeBuilding.put("id", "int");
		attributeBuilding.put("name", "String");
		listEntity.put("Building", attributeBuilding);

		// String[] attributeDispatcher = {"id", "name","building"};
		HashMap<String, String> attributeDispatcher = new HashMap<String, String>();
		attributeDispatcher.put("id", "int");
		attributeDispatcher.put("name", "String");
		attributeDispatcher.put("building", "Building");
		listEntity.put("Dispatcher", attributeDispatcher);

		// String[] attributeBand = {"id", "name", "building"};
		HashMap<String, String> attributeBand = new HashMap<String, String>();
		attributeBand.put("id", "int");
		attributeBand.put("name", "String");
		attributeBand.put("dispatcher", "Dispatcher");
		listEntity.put("Band", attributeBand);

		// String[] attributeProbe = {"id", "mac","num"};
		HashMap<String, String> attributeProbe = new HashMap<String, String>();
		attributeProbe.put("id", "int");
		attributeProbe.put("mac", "String");
		attributeProbe.put("num", "int");
		listEntity.put("Probe", attributeProbe);

		// String[] attributeRoom = {"id", "name","building"};
		HashMap<String, String> attributeRoom = new HashMap<String, String>();
		attributeRoom.put("id", "int");
		attributeRoom.put("name", "String");
		attributeRoom.put("building", "Building");
		listEntity.put("Room", attributeRoom);

		// String[] attributeSwitches = {"id", "ip","name", "dispatcher"};
		HashMap<String, String> attributeSwitches = new HashMap<String, String>();
		attributeSwitches.put("id", "int");
		attributeSwitches.put("ip", "String");
		attributeSwitches.put("name", "String");
		attributeSwitches.put("dispatcher", "Dispatcher");
		listEntity.put("Switches", attributeSwitches);

		// String[] attributeVlan = {"id", "name", "num"};
		HashMap<String, String> attributeVlan = new HashMap<String, String>();
		attributeVlan.put("id", "int");
		attributeVlan.put("name", "String");
		attributeVlan.put("num", "String");
		listEntity.put("Vlan", attributeVlan);
		Gson gson = new Gson();
		String json = gson.toJson(listEntity);
		return json;
	}

	@RequestMapping(value = "getResults", method = RequestMethod.POST)
	public @ResponseBody
	String getResults(@RequestBody String json, HttpServletResponse response)
			throws ClassNotFoundException {
		
		AdvancedSearch adv = AdvancedSearch.fromJsonToAdvancedSearch(json);
		
		Class<?> typeCls = Class.forName("org.sio.jnetmap.domain."
				+ adv.getType());

		HashMap<String, ArrayList<String>> items = new HashMap<String, ArrayList<String>>();

		ArrayList<String> itemBuilding = new ArrayList<String>();
		itemBuilding.add("Building buil");
		itemBuilding.add("buil");
		items.put("building", itemBuilding);

		ArrayList<String> itemBand = new ArrayList<String>();
		itemBand.add("Band band");
		itemBand.add("band");
		items.put("band", itemBand);

		ArrayList<String> itemDispatcher = new ArrayList<String>();
		itemDispatcher.add("Dispatcher disp");
		itemDispatcher.add("disp");
		items.put("dispatcher", itemDispatcher);

		ArrayList<String> itemModules = new ArrayList<String>();
		itemModules.add("Modules modu");
		itemModules.add("modu");
		items.put("A_Module", itemModules);

		ArrayList<String> itemOutlet = new ArrayList<String>();
		itemOutlet.add("Outlet outl");
		itemOutlet.add("outl");
		items.put("outlet", itemOutlet);

		ArrayList<String> itemPort = new ArrayList<String>();
		itemPort.add("Port port");
		itemPort.add("port");
		items.put("port", itemPort);

		ArrayList<String> itemRoom = new ArrayList<String>();
		itemRoom.add("Room room");
		itemRoom.add("room");
		items.put("room", itemRoom);

		ArrayList<String> itemSwitches = new ArrayList<String>();
		itemSwitches.add("Switches swit");
		itemSwitches.add("swit");
		items.put("A_Switch", itemSwitches);

		ArrayList<String> itemVlan = new ArrayList<String>();
		itemVlan.add("Vlan vlan");
		itemVlan.add("vlan");
		items.put("vlan", itemVlan);

		ArrayList<String> requests = new ArrayList<String>();
		ArrayList<String> jointures = new ArrayList<String>();
		ArrayList<String> froms = new ArrayList<String>();
		String type = adv.getType();
		String minType = type.substring(0, 4).toLowerCase();
		froms.add(type + " " + minType);

		for (String requestValue : adv.getRequests()) {
			String result = null;
			ArrayList<String> corps = new ArrayList<String>();
			String operator = null;
			ArrayList<String> corpList = new ArrayList<String>();
			if (requestValue.contains(">=")) {
				operator = ">=";
				String[] requestValueSplitted = requestValue.split(">=");
				for (String string : requestValueSplitted) {
					corpList.add(string);
				}
				result = corpList.get(1);
				if (corpList.get(0).contains(".")) {
					String[] split = corpList.get(0).split(".");
					for (String string : split) {
						corps.add(string);
					}
				} else {
					corps.add(corpList.get(0));
				}
			} else if (requestValue.contains("<=")) {
				operator = "<=";
				String requestValueSplitted[] = requestValue.split("<=");
				for (String string : requestValueSplitted) {
					corpList.add(string);
				}
				result = corpList.get(1);
				if (corpList.get(0).contains(".")) {
					String[] split = corpList.get(0).split(".");
					for (String string : split) {
						corps.add(string);
					}
				} else {
					corps.add(corpList.get(0));
				}
			} else if (requestValue.contains("!=")) {
				operator = "!=";
				String requestValueSplitted[] = requestValue.split("!=");
				for (String string : requestValueSplitted) {
					corpList.add(string);
				}
				result = corpList.get(1);
				if (corpList.get(0).contains(".")) {
					String split[] = corpList.get(0).split(".");
					for (String string : split) {
						corps.add(string);
					}
				} else {
					corps.add(corpList.get(0));
				}
			} else if (requestValue.contains(">")) {
				operator = ">";
				String requestValueSplitted[] = requestValue.split(">");
				for (String string : requestValueSplitted) {
					corpList.add(string);
				}
				result = corpList.get(1);
				if (corpList.get(0).contains(".")) {
					String[] split = corpList.get(0).split(".");
					for (String string : split) {
						corps.add(string);
					}
				} else {
					corps.add(corpList.get(0));
				}
			} else if (requestValue.contains("<")) {
				operator = "<";
				String requestValueSplitted[] = requestValue.split("<");
				for (String string : requestValueSplitted) {
					corpList.add(string);
				}
				result = corpList.get(1);
				if (corpList.get(0).contains(".")) {
					String[] split = corpList.get(0).split(".");
					for (String string : split) {
						corps.add(string);
					}
				} else {
					corps.add(corpList.get(0));
				}
			} else if (requestValue.contains("=")) {
				operator = "=";
				String requestValueSplitted[] = requestValue.split("=");
				for (String string : requestValueSplitted) {
					corpList.add(string);
				}
				result = corpList.get(1);
				if (corpList.get(0).contains(".")) {
					String plop = corpList.get(0);
					String split[] = plop.split("\\.");
					for (String string : split) {
						corps.add(string);
					}
				} else {
					corps.add(corpList.get(0));
				}
			}

			if (corps.size() == 1) {
				String request = minType + "." + corps.get(0) + " " + operator
						+ " " + result;
				requests.add(request);
			} else {
				int i = 0;
				for (String string : corps) {
					if (i == corps.size() - 1) {
						String request = items.get(corps.get(i - 1)).get(1)
								+ "." + corps.get(i) + " " + operator + " "
								+ result;
						requests.add(request);
					} else {
						String whereClause = "";
						if (i == 0) {
							whereClause += minType + "." + string + " = "
									+ items.get(string).get(1) + ".id";
							froms.add(items.get(string).get(0));
						} else {
							whereClause += items.get(corps.get(i - 1)).get(1)
									+ "." + string + " = "
									+ items.get(string).get(1) + ".id";
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
		query += minType + ".* FROM ";
		String fromClause = "";
		int iterFroms = 0;
		for (String string : froms) {
			fromClause += string;
			if (iterFroms < froms.size() - 1)
				fromClause += " , ";
			iterFroms++;
		}
		query += fromClause + " WHERE ";
		String jointure = "";
		int iterJointures = 0;
		for (String string : jointures) {
			jointure += string;
			if (iterJointures < jointures.size() - 1)
				jointure += " AND ";
			iterJointures++;
		}
		if (iterJointures > 0) {
			jointure += " AND ";
		}
		query += jointure + "(";
		String req = "";
		int iterReq = 0;
		for (String string : requests) {
			req += string;
			if (iterReq <= requests.size() - 1)
				req += " " + adv.getOperators().get(iterReq) + " ";
			iterReq++;

		}
		query += req + " )";
		Gson gson = new Gson();
		int iTotalRecords = 2000;
		int sEcho = 1;
		JsonObject jsonResponse = new JsonObject();
		int iTotalDisplayRecords = 0;
		if (type.equals("Band")) {
			List<Band> bands = Band.findBandsWithCustomQuery(query);
			iTotalDisplayRecords = bands.size();
			jsonResponse.add("aaData", gson.toJsonTree(bands));
		} else if (type.equals("Building")) {
			List<Building> buildings = Building
					.findBuildingsWithCustomQuery(query);
			iTotalDisplayRecords = buildings.size();
			jsonResponse.add("aaData", gson.toJsonTree(buildings));
		} else if (type.equals("Dispatcher")) {
			List<Dispatcher> dispatchers = Dispatcher
					.findDispatchersWithCustomQuery(query);
			iTotalDisplayRecords = dispatchers.size();
			jsonResponse.add("aaData", gson.toJsonTree(dispatchers));
		} else if (type.equals("Modules")) {
			List<Modules> modules = Modules.findModulesWithCustomQuery(query);
			iTotalDisplayRecords = modules.size();
			jsonResponse.add("aaData", gson.toJsonTree(modules));
		} else if (type.equals("Outlet")) {
			List<Outlet> outlets = Outlet.findOutletsWithCustomQuery(query);
			iTotalDisplayRecords = outlets.size();
			Gson gsonBuilder = new GsonBuilder()
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
	    	JsonElement jsonOutlets = gsonBuilder.toJsonTree(outlets, new TypeToken<List<Outlet>>(){}.getType());
			
			jsonResponse.add("aaData", jsonOutlets);
		} else if (type.equals("Switches")) {
			List<Switches> switches = Switches
					.findSwitchesWithCustomQuery(query);
			iTotalDisplayRecords = switches.size();
			jsonResponse.add("aaData", gson.toJsonTree(switches));
		} else if (type.equals("Room")) {
			List<Room> rooms = Room.findRoomsWithCustomQuery(query);
			iTotalDisplayRecords = rooms.size();
			jsonResponse.add("aaData", gson.toJsonTree(rooms));
		} else if (type.equals("Port")) {
			List<Port> ports = Port.findPortsWithCustomQuery(query);
			iTotalDisplayRecords = ports.size();
			jsonResponse.add("aaData", gson.toJsonTree(ports));
		} else if (type.equals("Vlan")) {
			List<Vlan> vlans = Vlan.findVlansWithCustomQuery(query);
			iTotalDisplayRecords = vlans.size();
			jsonResponse.add("aaData", gson.toJsonTree(vlans));
		}

		jsonResponse.addProperty("iTotalDisplayRecords", iTotalDisplayRecords);
		jsonResponse.addProperty("sEcho", sEcho);
		jsonResponse.addProperty("iTotalRecords", iTotalRecords);
		response.setContentType("application/Json");
		try {
			response.getWriter().print(jsonResponse.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonResponse.toString();
	}

	public static void removeDuplicate(ArrayList<String> arlList) {
		HashSet<String> h = new HashSet<String>(arlList);
		arlList.clear();
		arlList.addAll(h);
	}
	
	
	
	
	@RequestMapping(value = "ajaxRooms", method = RequestMethod.GET)
	  public @ResponseBody
	List<Room> ajaxRooms(@RequestParam String buildingId) {
		List<Room> rooms = new ArrayList<Room>();
		
		String strBuildId= buildingId;
		if (strBuildId != null) {
		            // TODO traiter le cas idBat == 0
		Long buildId = Long.parseLong(strBuildId);
		
		rooms = Room.findRoomsOfBuilding(buildId);
		
	
		}
		return rooms;
	}
	
	@RequestMapping(value = "ajaxOutlets", method = RequestMethod.GET)
	  public @ResponseBody
	List<Outlet> ajaxOutlets(@RequestParam String roomId) {
		List<Outlet> outlets = new ArrayList<Outlet>();
		
		String strRoomId= roomId;
		if (strRoomId != null) {
		            // TODO traiter le cas idRoom == 0
		Long roomsId = Long.parseLong(strRoomId);		
		outlets = Outlet.findOutletOfRooms(roomsId);
		
	
		}
		
		return outlets;
	}
	
	
	
	//adding
	
	
	

	
	
	

	

	
	@RequestMapping(value = "test")
	public String test(){
		return "uc/admin/test";
	}
}
