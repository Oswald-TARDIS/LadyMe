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
	public boolean insert(HUser u){
		return super.insert(u.toMap());
	}
	public boolean update(HUser u,String where,String whereSet){
		return super.update(u.toMap(), where, whereSet);
	}
	public List<HUser> queryForList(String where,String whereSet) throws SQLException{
		ResultSet rs=super.query(where, whereSet);
		List<HUser> li=new ArrayList<>();
		while(rs.next()){
			HUser n=new HUser();
			n.setID(rs.getString("id"));
			n.setName(rs.getString("name"));
			n.setPasswd(rs.getString("passwd"));
			li.add(n);
		}
		return li;
	}
}
