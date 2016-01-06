package com.oswald.ladyme.bean;

import java.util.HashMap;

public class Order implements BaseBean {
	int id;
	String Cid;
	String Cphone;
	String Hid;
	String Hphone;
	String origin_place;
	String destination;
	String time;
	String flag;

	@Override
	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("Cid", Cid);
		map.put("origin_place", origin_place);
		map.put("destination", destination);
		map.put("Cphone", Cphone);
		map.put("Hid", Hid);
		map.put("Hphone", Hphone);
		map.put("time", time);
		map.put("flag", flag);
		return map;
	}

	public String getHid() {
		return Hid;
	}

	public void setHid(String hid) {
		Hid = hid;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCid() {
		return Cid;
	}

	public void setCid(String Cid) {
		this.Cid = Cid;
	}

	public String getCphone() {
		return Cphone;
	}

	public void setCphone(String Cphone) {
		this.Cphone = Cphone;
	}

	public String getHId() {
		return Hid;
	}

	public void setHId(String Hid) {
		this.Hid = Hid;
	}

	public String getHphone() {
		return Hphone;
	}

	public void setHphone(String Hphone) {
		this.Hphone = Hphone;
	}

	public String getDestin() {
		return destination;
	}

	public void setDestin(String destination) {
		this.destination = destination;
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

}
