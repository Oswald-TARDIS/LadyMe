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

	public boolean insert(CUser u) {
		return super.insert(u.toMap());
	}

	public boolean update(CUser u, String where, String whereSet) {
		return super.update(u.toMap(), where, whereSet);
	}

	public List<CUser> queryForList(String where, String whereSet) throws SQLException {
		ResultSet rs = super.query(where, whereSet);
		List<CUser> li = new ArrayList<>();
		while (rs.next()) {
			CUser n = new CUser();
			n.setID(rs.getString("id"));
			n.setName(rs.getString("name"));
			n.setPasswd(rs.getString("passwd"));
			li.add(n);
		}
		return li;
	}
}
