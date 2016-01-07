package com.oswald.ladyme.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import com.oswald.ladyme.dao.GoodDaoImpl;
import com.oswald.ladyme.dao.HpuserDaoImpl;
import com.oswald.ladyme.dao.OrderDaoImpl;
import com.oswald.ladyme.dao.VehicleDaoImpl;
import com.oswald.ladyme.dao.HuserDaoImpl;
import com.oswald.ladyme.tools.DataBase;

public class OrderService {

	// 查询未确认订单
	public void selectUncofirm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		OrderDaoImpl Odi = new OrderDaoImpl();
		List<Order> li = new ArrayList<>();
		if (user.getType() == User.CLIENT) {
			li = Odi.queryHForList(user.getID(), OrderDaoImpl.unconfirmG);
			session.setAttribute("selectUncofirm", li);
		}
		if (user.getType() == User.DRIVER) {
			li = Odi.queryCForList(user.getID(), OrderDaoImpl.unconfirmV);
			session.setAttribute("selectUncofirm", li);
		}
		if(li==null){
			li=new ArrayList<>();
			Order o=new Order();
			o.setOrigin_place("查询结果为空");
			li.add(o);
			session.setAttribute("selectUncofirm", li);
		}
		session.setAttribute("selectUncofirmQueryed", 1);
		response.sendRedirect("personal_order_uconfirm.jsp");
	}

	// 查询进行中认订单
	public void selectRunning(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		OrderDaoImpl Odi = new OrderDaoImpl();
		List<Order> li=new ArrayList<>();
		if (user.getType() == User.CLIENT) {
			li = Odi.queryHForList(user.getID(), OrderDaoImpl.running);
			session.setAttribute("selectRunning", li);
		}
		if (user.getType() == User.DRIVER) {
			li = Odi.queryCForList(user.getID(), OrderDaoImpl.running);
			session.setAttribute("selectRunning", li);
		}
		if(li==null){
			li=new ArrayList<>();
			Order o=new Order();
			o.setOrigin_place("查询结果为空");
			li.add(o);
			session.setAttribute("selectRunning", li);
		}
		if (user.getType() == User.CLIENT) {
			li = Odi.queryHForList(user.getID(), OrderDaoImpl.arrive);
			session.setAttribute("selectArrive", li);
		}
		if (user.getType() == User.DRIVER) {
			li = Odi.queryCForList(user.getID(), OrderDaoImpl.arrive);
			session.setAttribute("selectArrive", li);
		}
		if(li==null){
			li=new ArrayList<>();
			Order o=new Order();
			o.setOrigin_place("查询结果为空");
			li.add(o);
			session.setAttribute("selectArrive", li);
		}
		session.setAttribute("selectRunningQueryed", 1);
		response.sendRedirect("personal_order_running.jsp");
	}

	// 查询已签收订单
	public void selectDone(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		OrderDaoImpl Odi = new OrderDaoImpl();
		List<Order> li=new ArrayList<>();
		if (user.getType() == User.CLIENT) {
			li = Odi.queryHForList(user.getID(), OrderDaoImpl.done);
			session.setAttribute("selectDone", li);
		}
		if (user.getType() == User.DRIVER) {
			li = Odi.queryCForList(user.getID(), OrderDaoImpl.done);
			session.setAttribute("selectDone", li);
		}
		if(li==null){
			li=new ArrayList<>();
			Order o=new Order();
			o.setOrigin_place("查询结果为空");
			li.add(o);
			session.setAttribute("selectDone", li);
		}
		session.setAttribute("selectDoneQueryed", 1);
		response.sendRedirect("personal_order_done.jsp");
	}

	public void createOrderG(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		HttpSession session=request.getSession();
		Goods g=(Goods)session.getAttribute("infoGood");
		User u=(User)session.getAttribute("user");
		CpuserDaoImpl cdi=new CpuserDaoImpl();
		ResultSet rs=cdi.query("id", u.getID());
		PrintWriter out=response.getWriter();
		if(rs.next()){
			Order o=new Order();
			o.setCid(u.getID());
			o.setCphone(rs.getString("phone"));
			o.setDestination(g.getDestination());
			o.setFlag(OrderDaoImpl.unconfirmG);
			o.setHid(g.getUserID());
			o.setHphone(g.getPhone());
			o.setOrigin_place(g.getOrigin_place());
			o.setTime(g.getTime());
			OrderDaoImpl odi=new OrderDaoImpl();
			odi.insert(o);
			GoodDaoImpl gdi=new GoodDaoImpl();
			gdi.delete("id",g.getId());
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
		User u=(User)session.getAttribute("user");
		HpuserDaoImpl hdi=new HpuserDaoImpl();
		ResultSet rs=hdi.query("id", u.getID());
		PrintWriter out=response.getWriter();
		if(rs.next()){
			Order o=new Order();
			o.setHid(u.getID());
			o.setHphone(rs.getString("phone"));
			o.setDestination(g.getDestination());
			o.setFlag(OrderDaoImpl.unconfirmV);
			o.setCid(g.getUserID());
			o.setCphone(g.getPhone());
			o.setOrigin_place(g.getOrigin_place());
			o.setTime(g.getTime());
			OrderDaoImpl odi=new OrderDaoImpl();
			odi.insert(o);
			VehicleDaoImpl vdi=new VehicleDaoImpl();
			vdi.delete("id",g.getId());
			response.sendRedirect("personal_order_uconfirm.jsp");
		}else{
			System.out.println("error");
			out.println("<script>alert('请先完善个人信息!')</script>");
			response.sendRedirect("personal.jsp");
		}
		
	}

	public void changeFlag(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int flag=Integer.parseInt(request.getParameter("flag"));
		int id=Integer.parseInt(request.getParameter("id"));
		OrderDaoImpl odi=new OrderDaoImpl();
		HashMap<String,Object> map=new HashMap<>();
		map.put("flag", flag);
		odi.update(map, "id", id);
		if(flag==OrderDaoImpl.running||flag==OrderDaoImpl.arrive){
			response.sendRedirect("OrderController?action=selectRunning");
			return;
		}
		if(flag==OrderDaoImpl.done){
			response.sendRedirect("OrderController?action=selectDone");
			return;
		}
	}

	public void removeOrder(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		OrderDaoImpl odi=new OrderDaoImpl();
		odi.delete("id", id);
	}
}
