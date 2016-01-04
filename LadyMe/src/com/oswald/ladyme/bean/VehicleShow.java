package com.oswald.ladyme.bean;


public class VehicleShow{
	protected int id;
	protected String origin_place;
	protected String destination;
	protected String plate_num;
	protected float load_weight;
	protected float car_length;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getCar_length() {
		return car_length;
	}

	public void setCar_length(float car_length) {
		this.car_length = car_length;
	}

	

}
