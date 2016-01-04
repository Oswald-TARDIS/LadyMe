package com.oswald.ladyme.bean;

import java.util.HashMap;

public class Goods extends GoodsShow implements BaseBean{
	protected String phone;
	protected float good_weight;
	protected String car_type;
	protected float car_length;
	protected float price;
	protected String message;
 
 
 @Override
	public HashMap<String, Object> toMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("origin_place", origin_place);
		map.put("destination", destination);
		map.put("good_type", good_type);
		map.put("time", time);
		map.put("phone",phone);
		map.put("good_weight",good_weight);
		map.put("car_type",car_type);
		map.put("car_length",car_length);
		map.put("price",price);
		map.put("message",message);
		return map;
		 
	}
 
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public float getGood_weight() {
	return good_weight;
}
public void setGood_weight(float good_weight) {
	this.good_weight = good_weight;
}
public String getCar_type() {
	return car_type;
}
public void setCar_type(String car_type) {
	this.car_type = car_type;
}
public float getCat_length() {
	return car_length;
}
public void setCat_length(float cat_length) {
	this.car_length = cat_length;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
 
 
}
