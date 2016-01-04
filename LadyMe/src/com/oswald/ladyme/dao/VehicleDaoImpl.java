package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
}
