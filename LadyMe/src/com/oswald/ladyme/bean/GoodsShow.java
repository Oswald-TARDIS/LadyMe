package com.oswald.ladyme.bean;

import java.util.HashMap;

import org.apache.tomcat.util.modeler.BaseModelMBean;

public class GoodsShow implements BaseBean {
	int id;
	String origin_place;
	String destination;
	String good_type;
	String time;
	
	
	@Override
	public HashMap<String, Object> toMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("origin_place", origin_place);
		map.put("destination", destination);
		map.put("good_type", good_type);
		map.put("time", time);
		return map;
		 
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOrigin_place() {
		return origin_place;
	}


	public void setOrigin_place(String origin_place) {
		this.origin_place = origin_place;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getGood_type() {
		return good_type;
	}


	public void setGood_type(String good_type) {
		this.good_type = good_type;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}
	

}
