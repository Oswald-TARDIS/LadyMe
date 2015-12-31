package com.oswald.ladyme.bean;

public class User {
	public final static int CLIENT = 0;
	public final static int DRIVER = 1;
	protected String ID;
	protected String name;
	protected int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
