package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oswald.ladyme.bean.CUser;

public class CuserDaoImpl extends BaseDaoImpl {
	public final static String theTable = "c_user";

	public CuserDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
}
