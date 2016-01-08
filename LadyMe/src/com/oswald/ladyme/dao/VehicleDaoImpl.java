package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oswald.ladyme.bean.Goods;
import com.oswald.ladyme.bean.Vehicle;
import com.oswald.ladyme.bean.VehicleShow;

public class VehicleDaoImpl extends BaseDaoImpl{
	public final static String theTable="send_vehicle";
	public VehicleDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}
	public List<VehicleShow> queryForList(int beginIndex, int pageSize) throws SQLException {
		ResultSet rs = super.query(beginIndex, pageSize);
		List<VehicleShow> li = new ArrayList<>();
		while (rs.next()) {
			VehicleShow n = new VehicleShow();
			n.setId(rs.getInt("id"));
			n.setPlate_num(rs.getString("plate_num"));
			n.setCar_length(rs.getFloat("car_length"));
			n.setDestination(rs.getString("destination"));
			n.setLoad_weight(rs.getFloat("load_weight"));
			n.setOrigin_place(rs.getString("origin_place"));
			li.add(n);
		}
		return li;
	}
	
	public List<Vehicle>queryallForList(String id) throws SQLException{
		ResultSet rs = super.query("userID",id);
		List<Vehicle> li = new ArrayList<>();
		while (rs.next()) {
			Vehicle s=new Vehicle();
			s.setCar_length(rs.getFloat("car_length"));
			s.setCar_type(rs.getString("car_type"));
			s.setDestination(rs.getString("destination"));
			s.setId(rs.getInt("id"));
			s.setLoad_weight(rs.getFloat("load_weight"));
			s.setMessage(rs.getString("message"));
			s.setOrigin_place(rs.getString("origin_place"));
			s.setPhone(rs.getString("phone"));
			s.setPlate_num(rs.getString("plate_num"));
			s.setTime(rs.getString("time"));
			s.setUserID(rs.getString("userID"));
			li.add(s);
		}
		return li;
	}
	public Vehicle query(int id) throws SQLException{
		ResultSet rs=super.query("id", id);
		System.out.println(id);
		if(rs.next()){
			Vehicle s=new Vehicle();
			s.setCar_length(rs.getFloat("car_length"));
			s.setCar_type(rs.getString("car_type"));
			s.setDestination(rs.getString("destination"));
			s.setId(rs.getInt("id"));
			s.setLoad_weight(rs.getFloat("load_weight"));
			s.setMessage(rs.getString("message"));
			s.setOrigin_place(rs.getString("origin_place"));
			s.setPhone(rs.getString("phone"));
			s.setPlate_num(rs.getString("plate_num"));
			s.setTime(rs.getString("time"));
			s.setUserID(rs.getString("userID"));
			return s;
			}
		return null;
		
	}
	
}
