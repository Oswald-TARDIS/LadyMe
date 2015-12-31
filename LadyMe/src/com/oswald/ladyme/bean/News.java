package com.oswald.ladyme.bean;

import java.util.HashMap;

public class News implements BaseBean {
	String title;
	String time;
	String auther;

	@Override
	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("title", title);
		map.put("time", time);
		map.put("auther", auther);
		return map;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}
}
