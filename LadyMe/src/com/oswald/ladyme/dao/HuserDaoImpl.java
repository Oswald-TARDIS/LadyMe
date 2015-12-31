package com.oswald.ladyme.dao;

import com.oswald.ladyme.bean.HUser;

public class HuserDaoImpl extends BaseDaoImpl{
	public final static String theTable="h_user";
	public HuserDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public boolean insert(HUser u){
		return super.insert(u.toMap());
	}
}
