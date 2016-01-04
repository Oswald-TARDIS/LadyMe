package com.oswald.ladyme.bean;

import java.util.HashMap;

public class VehicleShow implements BaseBean{
	int id;
	String origin_place;
	String destination;
	String plate_num;
	float load_weight;
	float car_length;
	
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

	public String getPlate_num() {
		return plate_num;
	}

	public void setPlate_num(String plate_num) {
		this.plate_num = plate_num;
	}

	public float getLoad_weight() {
		return load_weight;
	}

	public void setLoad_weight(float load_weight) {
		this.load_weight = load_weight;
	}

	public float getCar_length() {
		return car_length;
	}

	public void setCar_length(float car_length) {
		this.car_length = car_length;
	}

	@Override
	public HashMap<String, Object> toMap() {
		// TODO Auto-generated method stub
		HashMap<String,Object> map=new HashMap<>();
		map.put("id", id);
		map.put("origin_place", origin_place);
		map.put("destination", destination);
		map.put("plate_num", plate_num);
		map.put("load_weight", load_weight);
		map.put("car_length", car_length);
		return map;
	}

}
