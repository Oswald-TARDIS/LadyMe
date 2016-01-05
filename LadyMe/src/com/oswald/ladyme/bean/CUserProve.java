package com.oswald.ladyme.bean;

import java.util.HashMap;

public class CUserProve extends UserProve implements BaseBean{
	String OperateLicense;

	public String getOperateLicense() {
		return OperateLicense;
	}

	public void setOperateLicense(String OperateLicense) {
		this.OperateLicense = OperateLicense;
	}

	public HashMap<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", ID);
		map.put("sex", sex);
		map.put("photo", photo);
		map.put("IDphoto", IDphoto);
		map.put("IDnumber", IDnumber);
		map.put("phone", phone);
		map.put("origin_place", origin_place);
		return map;
	}
}
