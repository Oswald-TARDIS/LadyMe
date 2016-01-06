package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oswald.ladyme.bean.Order;

public class OrderDaoImpl extends BaseDaoImpl{
	public final static String theTable = "orders";
	public final static int unconfirm=0;
	public final static int running=1;
	public final static int arrive=2;
	public final static int done=3;
	
	public OrderDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public List<Order> queryHForList(String where,Object whereSet) throws SQLException {
		ResultSet rs = super.query(where, whereSet);
		List<Order> li = new ArrayList<>();
		while (rs.next()) {
			Order n = new Order();
			n.setId(rs.getInt("id"));
			n.setCid(rs.getString("Cid"));
			n.setCphone(rs.getString("Cphone"));
			n.setOrigin_place(rs.getString("origin_place"));
			n.setDestination( rs.getString("destination"));
            n.setTime(rs.getString("time"));            
            n.setFlag(rs.getString("flag"));	
			li.add(n);
		}
		return li;
	}
	public List<Order> queryCForList(String where,Object whereSet) throws SQLException {
		ResultSet rs = super.query(where, whereSet);
		List<Order> li = new ArrayList<>();
		while (rs.next()) {
			Order n = new Order();
			n.setId(rs.getInt("id"));
			n.setHid(rs.getString("Hid"));
			n.setHphone(rs.getString("Hphone"));
			n.setOrigin_place(rs.getString("origin_place"));
			n.setDestination( rs.getString("destination"));
            n.setTime(rs.getString("time"));            
            n.setFlag(rs.getString("flag"));	
			li.add(n);
		}
		return li;
	}
}
