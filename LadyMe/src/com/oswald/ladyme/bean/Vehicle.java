package com.oswald.ladyme.bean;

import java.util.HashMap;

public class Vehicle extends VehicleShow implements BaseBean{
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
