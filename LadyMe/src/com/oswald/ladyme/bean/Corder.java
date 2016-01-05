package com.oswald.ladyme.bean;

import java.util.HashMap;

public class Corder implements BaseBean{
	int id;
	String origin_place;
	String destination;
	String plate_num;
	float load_weight;
	float car_length;
	String time;
	String flag;
	String situation;
	
	@Override
	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("origin_place", origin_place);
		map.put("destination", destination);
		map.put("plate_num", plate_num);
		map.put("load_weight", load_weight);
		map.put("car_length", car_length);
		map.put("time",time);
		map.put("flag", flag);
		map.put("situation", situation);
		return map;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getOrigin() {
		return origin_place;
	}

	public void setOrigin(String origin_place) {
		this.origin_place = origin_place;
	}
	
	public String getDestin() {
		return destination;
	}

	public void setDestin(String destination) {
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
	
	public float getCar_len() {
		return car_length;
	}

	public void setCar_len(float car_length) {
		this.car_length = car_length;
	}
	
	public String getTime() {
		return flag;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}
}
