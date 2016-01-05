package com.oswald.ladyme.bean;

import java.util.HashMap;

public class Horder implements BaseBean{
	int id;
	String origin_place;
	String destination;
	String phone;
	String good_type;
	float good_weight;
	float car_length;
	String car_type;
	float price;
	String message;
	String time;
	String flag;
	String situation;
	
	@Override
	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("origin_place", origin_place);
		map.put("destination", destination);
		map.put("phone", phone);
		map.put("good_type", good_type);
		map.put("good_weight", good_weight);
		map.put("car_length", car_length);
		map.put("car_type", car_type);
		map.put("price", price);
		map.put("message", message);
		map.put("time", time);
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
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getGood_type() {
		return good_type;
	}

	public void setGood_type(String good_type) {
		this.good_type = good_type;
	}
	
	public float getGood_weight() {
		return good_weight;
	}

	public void setGood_weight(float good_weight) {
		this.good_weight = good_weight;
	}
	
	public float getCar_len() {
		return car_length;
	}

	public void setCar_len(float car_length) {
		this.car_length = car_length;
	}
	
	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getMess() {
		return message;
	}

	public void setMess(String message) {
		this.message = message;
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
