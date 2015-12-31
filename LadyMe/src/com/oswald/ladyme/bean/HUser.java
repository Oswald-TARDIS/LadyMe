package com.oswald.ladyme.bean;

import java.util.HashMap;

public class HUser extends User implements BaseBean {
	String passwd;

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", ID);
		map.put("name", name);
		map.put("passwd", passwd);
		return map;
	}
}
