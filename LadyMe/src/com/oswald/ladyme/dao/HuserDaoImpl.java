package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.oswald.ladyme.bean.HUser;

public class HuserDaoImpl extends BaseDaoImpl{
	public final static String theTable="h_user";
	public HuserDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}

}
