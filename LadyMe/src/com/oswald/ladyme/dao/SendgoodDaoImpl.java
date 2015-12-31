package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.oswald.ladyme.bean.Sendgoods;

public class SendgoodDaoImpl extends BaseDaoImpl{
	public final static String theTable="send_good";
	public SendgoodDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public List<Sendgoods> queryForList(int beginIndex, int pageSize) throws SQLException {
		ResultSet rs = super.query(beginIndex, pageSize);
		List<Sendgoods> li = new ArrayList<>();
		while (rs.next()) {
			Sendgoods s=new Sendgoods();
			s.setId(rs.getInt("id"));
			s.setOrigin_place(rs.getString("origin_place"));
			s.setDestination(rs.getString("destination"));
			s.setGood_type(rs.getString("good_type"));
			s.setTime(rs.getString("time"));
			li.add(s);
		}
		return li;
	}

}
