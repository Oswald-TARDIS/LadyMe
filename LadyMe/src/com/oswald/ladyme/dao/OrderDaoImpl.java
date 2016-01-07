package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

import java.sql.PreparedStatement;
import com.oswald.ladyme.bean.Order;

public class OrderDaoImpl extends BaseDaoImpl{
	public final static String theTable = "orders";
	public final static int unconfirmG=-1;
	public final static int unconfirmV=0;
	public final static int running=1;
	public final static int arrive=2;
	public final static int done=3;
	
	public OrderDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public List<Order> queryHForList(String Hid,int flag) throws SQLException {
		String sql="select * from "+theTable+" where Hid=? and flag=?";
		Connection conn=db.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,Hid);
		ps.setInt(2,flag);
		ResultSet rs = ps.executeQuery();
		List<Order> li = new ArrayList<>();
		while (rs.next()) {
			Order n = new Order();
			n.setId(rs.getInt("id"));
			n.setCid(rs.getString("Cid"));
			n.setCphone(rs.getString("Cphone"));
			n.setOrigin_place(rs.getString("origin_place"));
			n.setDestination( rs.getString("destination"));
            n.setTime(rs.getString("time"));            
            n.setFlag(rs.getInt("flag"));	
			li.add(n);
		}
		return li;
	}
	public List<Order> queryCForList(String Cid,int flag) throws SQLException {
		String sql="select * from "+theTable+" where Cid=? and flag=?";
		Connection conn=db.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,Cid);
		ps.setInt(2,flag);
		ResultSet rs = ps.executeQuery();
		List<Order> li = new ArrayList<>();
		while (rs.next()) {
			Order n = new Order();
			n.setId(rs.getInt("id"));
			n.setHid(rs.getString("Hid"));
			n.setHphone(rs.getString("Hphone"));
			n.setOrigin_place(rs.getString("origin_place"));
			n.setDestination( rs.getString("destination"));
            n.setTime(rs.getString("time"));            
            n.setFlag(rs.getInt("flag"));	
			li.add(n);
		}
		return li;
	}
}
