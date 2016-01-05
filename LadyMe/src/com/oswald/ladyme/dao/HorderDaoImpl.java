package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oswald.ladyme.bean.Horder;
import com.oswald.ladyme.bean.News;

public class HorderDaoImpl extends BaseDaoImpl{
	public final static String theTable = "h_account";

	public HorderDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public List<Horder> queryForList(String whereSet) throws SQLException {
		ResultSet rs = super.query("situation", whereSet);
		List<Horder> li = new ArrayList<>();
		while (rs.next()) {
			Horder n = new Horder();
			n.setId(rs.getInt("id"));
			n.setOrigin(rs.getString("origin_place"));
			n.setDestin( rs.getString("destination"));
			n.setPhone(rs.getString("phone"));
			n.setGood_type(rs.getString("good_type"));
			n.setGood_weight(rs.getFloat("good_weight"));
			n.setCar_len(rs.getFloat("car_length"));
			n.setCar_type(rs.getString("car_type"));
			n.setPrice(rs.getFloat("price"));
			n.setMess(rs.getString("message"));
            n.setTime(rs.getString("time"));            
            n.setFlag(rs.getString("flag"));
            n.setSituation(rs.getString("situation"));			
			li.add(n);
		}
		return li;
	}
}
