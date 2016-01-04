package com.oswald.ladyme.bean;

import java.util.HashMap;

public class Vehicle extends VehicleShow implements BaseBean{
	protected String phone;
	protected String car_type;
	protected String message;
	protected String userID;
	protected String time;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
		map.put("userID", userID);
		map.put("message", message);
		map.put("car_type", car_type);
		map.put("phone", phone);
		map.put("time", time);
		return map;
	}
}
