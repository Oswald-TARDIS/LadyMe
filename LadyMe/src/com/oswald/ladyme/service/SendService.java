package com.oswald.ladyme.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oswald.ladyme.bean.News;
import com.oswald.ladyme.bean.Goods;
import com.oswald.ladyme.bean.GoodsShow;
import com.oswald.ladyme.bean.VehicleShow;
import com.oswald.ladyme.dao.CnewsDaoImpl;
import com.oswald.ladyme.dao.InnewsDaoImpl;
import com.oswald.ladyme.dao.GoodDaoImpl;
import com.oswald.ladyme.dao.VehicleDaoImpl;

public class SendService {
	GoodDaoImpl sgdi;
	VehicleDaoImpl svdi;
	HttpServletRequest request;
	HttpServletResponse response;

	public SendService(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		svdi = new VehicleDaoImpl();
		sgdi = new GoodDaoImpl();
	}

	public void query(ServletContext application) throws SQLException, IOException {
		// TODO Auto-generated method stub
		List<GoodsShow> li = new ArrayList<>();
		List<VehicleShow> li2 = new ArrayList<>();
		li2 = svdi.queryForList(0, 7);
		li = sgdi.queryForList(0, 7);
		application.setAttribute("infoSupply", li);
		application.setAttribute("infoVehicle", li2);
		response.sendRedirect("index.jsp");
	}
	public void insert() {
		Goods good=new Goods();
		System.out.println((String)request.getAttribute("originPlace"));
		System.out.println((String)request.getAttribute("good_weight"));
		good.setOrigin_place((String)request.getAttribute("originPlace"));
		good.setDestination((String)request.getAttribute("destination"));
		good.setPhone((String)request.getAttribute("phone"));
		good.setGood_type((String)request.getAttribute("good_type"));
		good.setGood_weight(Float.parseFloat((String)request.getAttribute("good_weight")));
		good.setCar_type((String)request.getAttribute("car_length"));
		good.setCar_length(Float.parseFloat((String)request.getAttribute("car_length")));
		good.setPrice(Float.parseFloat((String)request.getAttribute("price")));
		good.setMessage((String)request.getAttribute("message"));
		//sgdi.insert(good);
	}
}
