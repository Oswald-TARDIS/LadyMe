package com.oswald.ladyme.service;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oswald.ladyme.bean.News;
import com.oswald.ladyme.bean.User;
import com.oswald.ladyme.bean.Vehicle;
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
	public final static int pageSize = 10; 
	
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
		application.setAttribute("infoVehicles", li2);
		response.sendRedirect("index.jsp");
	}
	public void queryall() throws SQLException, IOException{
		List<Goods>li =new ArrayList<>();
		
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		li=sgdi.queryallForList(user.getID());
		session.setAttribute("queryall", li);
		response.sendRedirect("personal_goodshow.jsp");
	}
	public void insert() throws IOException {
		Goods good=new Goods();
		good.setUserID((String)request.getParameter("userID"));
		good.setOrigin_place((String)request.getParameter("originPlace"));
		good.setDestination((String)request.getParameter("destination"));
		good.setPhone((String)request.getParameter("phone"));
		good.setGood_type((String)request.getParameter("good_type"));
		good.setGood_weight(Float.parseFloat((String)request.getParameter("good_weight")));
		good.setCar_type((String)request.getParameter("car_type"));
		good.setCar_length(Float.parseFloat((String)request.getParameter("car_length")));
		good.setPrice(Float.parseFloat((String)request.getParameter("price")));
		good.setMessage((String)request.getParameter("message"));
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String time=sdf.format(date);
		good.setTime(time);
		sgdi.insert(good);
		response.sendRedirect("sendgood_success.jsp");
	}

	public void insertV() throws IOException {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle();
		vehicle.setUserID((String)request.getParameter("userID"));
		vehicle.setOrigin_place((String)request.getParameter("originPlace"));
		vehicle.setDestination((String)request.getParameter("destination"));
		vehicle.setPlate_num((String)request.getParameter("plate_num"));
		vehicle.setPhone((String)request.getParameter("phone"));
		vehicle.setLoad_weight(Float.parseFloat((String)request.getParameter("load_weight")));
		vehicle.setCar_type((String)request.getParameter("car_type"));
		vehicle.setCar_length(Float.parseFloat((String)request.getParameter("car_length")));
		vehicle.setMessage((String)request.getParameter("message"));
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String time=sdf.format(date);
		vehicle.setTime(time);
		svdi.insert(vehicle);
		response.sendRedirect("sendgood_success.jsp");
	}

	public void getVehiclePage() throws SQLException, IOException {
		// TODO Auto-generated method stub
		int page=Integer.valueOf(request.getParameter("page"));
		List<VehicleShow> li=svdi.queryForList(pageSize*(page-1), pageSize);
		HttpSession session=request.getSession();
		session.setAttribute("vehiclePage", li);
		response.sendRedirect("showvehicle.jsp");
	}
	public void getGoodPage() throws SQLException, IOException {
		// TODO Auto-generated method stub
		int page=Integer.valueOf(request.getParameter("page"));
		List<GoodsShow> li=sgdi.queryForList(pageSize*(page-1), pageSize);
		HttpSession session=request.getSession();
		session.setAttribute("goodPage", li);
		response.sendRedirect("showgoods.jsp");
	}
	
	public void getGood() throws SQLException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		Goods g=sgdi.query(id);
		HttpSession session=request.getSession();
		session.setAttribute("infoGood", g);
		if(g==null){
			response.sendRedirect("error.jsp");
			return;
		}
		response.sendRedirect("infogood.jsp");
	}
	public void getVehicle() throws SQLException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		Vehicle v=svdi.query(id);
		HttpSession session=request.getSession();
		session.setAttribute("infoVehicle", v);
		if(v==null){
			response.sendRedirect("error.jsp");
			return;
		}
		response.sendRedirect("infovehicle.jsp");
	}

	public void queryallV() throws SQLException, IOException {
		// TODO Auto-generated method stub
		List<Vehicle>li =new ArrayList<>();
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		li=svdi.queryallForList(user.getID());
		System.out.println(user.getID());
		session.setAttribute("queryallV", li);
		response.sendRedirect("personal_vehicleshow.jsp");
	}
}
