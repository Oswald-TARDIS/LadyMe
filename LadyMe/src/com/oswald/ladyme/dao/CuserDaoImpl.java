package com.oswald.ladyme.dao;

import com.oswald.ladyme.bean.CUser;

public class CuserDaoImpl extends BaseDaoImpl{
	public final static String theTable="c_user";
	public CuserDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public boolean insert(CUser u){
		return super.insert(u.toMap());
	}
}
