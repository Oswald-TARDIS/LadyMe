package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.oswald.ladyme.bean.Goods;
import com.oswald.ladyme.bean.GoodsShow;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class GoodDaoImpl extends BaseDaoImpl{
	public final static String theTable="send_good";
	public GoodDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public List<GoodsShow> queryForList(int beginIndex, int pageSize) throws SQLException {
		ResultSet rs = super.query(beginIndex, pageSize);
		List<GoodsShow> li = new ArrayList<>();
		while (rs.next()) {
			GoodsShow s=new GoodsShow();
			s.setId(rs.getInt("id"));
			s.setOrigin_place(rs.getString("origin_place"));
			s.setDestination(rs.getString("destination"));
			s.setGood_type(rs.getString("good_type"));
			s.setTime(rs.getString("time"));
			li.add(s);
		}
		return li;
	}
	public List<Goods>queryallForList(String id) throws SQLException{
		ResultSet rs = super.query("userID",id);
		List<Goods> li = new ArrayList<>();
		while (rs.next()) {
			Goods s=new Goods();
			s.setId(rs.getInt("id"));
			s.setOrigin_place(rs.getString("origin_place"));
			s.setDestination(rs.getString("destination"));
			s.setPhone(rs.getString("phone"));
			s.setGood_type(rs.getString("good_type"));
			s.setGood_weight(rs.getFloat("good_weight"));
			s.setCar_type(rs.getString("car_type"));
			s.setCar_length(rs.getFloat("car_length"));
			s.setPrice(rs.getFloat("price"));
			s.setMessage(rs.getString("message"));
			s.setTime(rs.getString("time"));
			s.setUserID(id);
			li.add(s);
		}
		return li;
	}
	public Goods query(int id) throws SQLException{
		ResultSet rs=super.query("id", id);
		if(rs.next()){
			Goods g=new Goods();
			g.setCar_length(rs.getFloat("car_length"));
			g.setCar_type(rs.getString("car_type"));
			g.setDestination(rs.getString("destination"));
			g.setGood_type(rs.getString("good_type"));
			g.setGood_weight(rs.getFloat("good_weight"));
			g.setId(id);
			g.setMessage(rs.getString("message"));
			g.setOrigin_place(rs.getString("origin_place"));
			g.setPhone(rs.getString("phone"));
			g.setPrice(rs.getFloat("price"));
			g.setTime(rs.getString("time"));
			g.setUserID(rs.getString("userID"));
			return g;
			}
		return null;
		
	}
	
}
