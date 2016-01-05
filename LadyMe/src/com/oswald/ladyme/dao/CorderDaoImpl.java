package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oswald.ladyme.bean.Corder;
import com.oswald.ladyme.bean.Horder;

public class CorderDaoImpl extends BaseDaoImpl{
	public final static String theTable = "c_account";

	public CorderDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public List<Corder> queryForList(String whereSet) throws SQLException {
		ResultSet rs = super.query("situation", whereSet);
		List<Corder> li = new ArrayList<>();
		while (rs.next()) {
			Corder n = new Corder();
			n.setId(rs.getInt("id"));
			n.setOrigin(rs.getString("origin_place"));
			n.setDestin( rs.getString("destination"));
			n.setPlate_num(rs.getString("plate_num"));
			n.setLoad_weight(rs.getFloat("load_weight"));
			n.setCar_len(rs.getFloat("car_length"));
            n.setTime(rs.getString("time"));            
            n.setFlag(rs.getString("flag"));
            n.setSituation(rs.getString("situation"));	
			li.add(n);
		}
		return li;
	}
}
