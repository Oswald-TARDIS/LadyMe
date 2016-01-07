package com.oswald.ladyme.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.oswald.ladyme.bean.CUser;
import com.oswald.ladyme.bean.Goods;
import com.oswald.ladyme.bean.HUser;
import com.oswald.ladyme.bean.Order;
import com.oswald.ladyme.bean.User;
import com.oswald.ladyme.bean.Vehicle;
import com.oswald.ladyme.dao.CpuserDaoImpl;
import com.oswald.ladyme.dao.CuserDaoImpl;
import com.oswald.ladyme.dao.HpuserDaoImpl;
import com.oswald.ladyme.dao.OrderDaoImpl;
import com.oswald.ladyme.dao.HuserDaoImpl;
import com.oswald.ladyme.tools.DataBase;

public class OrderService {

	// 查询未确认订单
	public void selectUncofirm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		OrderDaoImpl Odi = new OrderDaoImpl();
		if (user.getType() == User.CLIENT) {
			List<Order> li = Odi.queryHForList("flag", OrderDaoImpl.unconfirm);
			session.setAttribute("selectUncofirm", li);
		}
		if (user.getType() == User.DRIVER) {
			List<Order> li = Odi.queryCForList("flag", OrderDaoImpl.unconfirm);
			session.setAttribute("selectUncofirm", li);
		}
		response.sendRedirect("personal_order_uconfirm.jsp");
	}

	// 查询进行中认订单
	public void selectRunning(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		OrderDaoImpl Odi = new OrderDaoImpl();
		if (user.getType() == User.CLIENT) {
			List<Order> li = Odi.queryHForList("flag", OrderDaoImpl.running);
			session.setAttribute("selectRunning", li);
		}
		if (user.getType() == User.DRIVER) {
			List<Order> li = Odi.queryCForList("flag", OrderDaoImpl.running);
			session.setAttribute("selectRunning", li);
		}
		response.sendRedirect("personal_order_running.jsp");
	}

	// 查询到达目的地订单
	public void selectArrive(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		OrderDaoImpl Odi = new OrderDaoImpl();
		if (user.getType() == User.CLIENT) {
			List<Order> li = Odi.queryHForList("flag", OrderDaoImpl.arrive);
			session.setAttribute("selectArrive", li);
		}
		if (user.getType() == User.DRIVER) {
			List<Order> li = Odi.queryCForList("flag", OrderDaoImpl.arrive);
			session.setAttribute("selectArrive", li);
		}
		response.sendRedirect("personal_order_running.jsp");
	}

	// 查询已签收订单
	public void selectDone(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		OrderDaoImpl Odi = new OrderDaoImpl();
		if (user.getType() == User.CLIENT) {
			List<Order> li = Odi.queryHForList("flag", OrderDaoImpl.done);
			session.setAttribute("selectDone", li);
		}
		if (user.getType() == User.DRIVER) {
			List<Order> li = Odi.queryCForList("flag", OrderDaoImpl.done);
			session.setAttribute("selectDone", li);
		}
		response.sendRedirect("personal_order_done.jsp");
	}

	public void createOrderG(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		HttpSession session=request.getSession();
		Goods g=(Goods)session.getAttribute("infoGood");
		User u=(User)session.getAttribute("User");
		CpuserDaoImpl cdi=new CpuserDaoImpl();
		ResultSet rs=cdi.query("id", u.getID());
		PrintWriter out=response.getWriter();
		if(rs.next()){
			Order o=new Order();
			o.setCid(u.getID());
			o.setCphone(rs.getString("phone"));
			o.setDestination(g.getDestination());
			o.setFlag(OrderDaoImpl.unconfirm);
			o.setHid(g.getUserID());
			o.setHphone(g.getPhone());
			o.setOrigin_place(g.getOrigin_place());
			o.setTime(g.getTime());
			OrderDaoImpl odi=new OrderDaoImpl();
			odi.insert(o);
			response.sendRedirect("personal_order_uconfirm.jsp");
		}else{
			System.out.println("error");
			out.println("<script>alert('请先完善个人信息!')</script>");
			response.sendRedirect("personal.jsp");
		}
		
	}

	public void createOrderV(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		HttpSession session=request.getSession();
		Vehicle g=(Vehicle)session.getAttribute("infoVehicle");
		User u=(User)session.getAttribute("User");
		HpuserDaoImpl hdi=new HpuserDaoImpl();
		ResultSet rs=hdi.query("id", u.getID());
		PrintWriter out=response.getWriter();
		if(rs.next()){
			Order o=new Order();
			o.setHid(u.getID());
			o.setHphone(rs.getString("phone"));
			o.setDestination(g.getDestination());
			o.setFlag(OrderDaoImpl.unconfirm);
			o.setCid(g.getUserID());
			o.setCphone(g.getPhone());
			o.setOrigin_place(g.getOrigin_place());
			o.setTime(g.getTime());
			OrderDaoImpl odi=new OrderDaoImpl();
			odi.insert(o);
			response.sendRedirect("personal_order_uconfirm.jsp");
		}else{
			System.out.println("error");
			out.println("<script>alert('请先完善个人信息!')</script>");
			response.sendRedirect("personal.jsp");
		}
		
	}
}
