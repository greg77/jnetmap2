package org.sio.jnetmap.domain;

import java.util.ArrayList;

import org.springframework.roo.addon.json.RooJson;

@RooJson
public class AdvancedSearch {
	
	String type;
	ArrayList<String> requests;
	ArrayList<String> operators;	
	
	public AdvancedSearch() {
		super();
		this.requests = new ArrayList<String>();
		this.operators = new ArrayList<String>();
	}
	
	public AdvancedSearch(String type, ArrayList<String> requests,
			ArrayList<String> operators) {
		super();
		this.type = type;
		this.requests = requests;
		this.operators = operators;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getRequests() {
		return requests;
	}
	public void setRequests(ArrayList<String> requests) {
		this.requests = requests;
	}
	public ArrayList<String> getOperators() {
		return operators;
	}
	public void setOperators(ArrayList<String> operators) {
		this.operators = operators;
	}
	
	

}
