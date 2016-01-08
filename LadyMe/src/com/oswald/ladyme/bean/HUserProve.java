package com.oswald.ladyme.bean;

import java.util.HashMap;

public class HUserProve extends UserProve implements BaseBean{
	String car_type;
	String plate_num;
	String load_weight;
	String car_length;
	String DrivingLicense;
	String DriverLicense;

	
	public String getCar_type() {
		return car_type;
	}


	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}


	public String getPlate_num() {
		return plate_num;
	}


	public void setPlate_num(String plate_num) {
		this.plate_num = plate_num;
	}


	public String getLoad_weight() {
		return load_weight;
	}


	public void setLoad_weight(String load_weight) {
		this.load_weight = load_weight;
	}


	public String getCar_length() {
		return car_length;
	}


	public void setCar_length(String car_length) {
		this.car_length = car_length;
	}


	public String getDrivingLicense() {
		return DrivingLicense;
	}


	public void setDrivingLicense(String drivingLicense) {
		DrivingLicense = drivingLicense;
	}


	public String getDriverLicense() {
		return DriverLicense;
	}


	public void setDriverLicense(String driverLicense) {
		DriverLicense = driverLicense;
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
