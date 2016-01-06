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
import com.oswald.ladyme.bean.HUser;
import com.oswald.ladyme.bean.Order;
import com.oswald.ladyme.bean.User;
import com.oswald.ladyme.dao.CuserDaoImpl;
import com.oswald.ladyme.dao.OrderDaoImpl;
import com.oswald.ladyme.dao.HuserDaoImpl;
import com.oswald.ladyme.tools.DataBase;

public class OrderService {
	
	//��ѯδȷ�϶���
	public void selectUncofirm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException  {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		OrderDaoImpl Odi=new OrderDaoImpl();
		if(user.getType()==User.CLIENT){
			List<Order> li=Odi.queryHForList("flag",OrderDaoImpl.unconfirm);
			session.setAttribute("selectUncofirm", li);
		}
		if(user.getType()==User.DRIVER){
			List<Order> li=Odi.queryCForList("flag",OrderDaoImpl.unconfirm);
			session.setAttribute("selectUncofirm", li);
		}
		response.sendRedirect("personal_order_uconfirm.jsp");
	}
	
	//��ѯ�������϶���
	public void selectRunning(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException  {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		OrderDaoImpl Odi=new OrderDaoImpl();
		if(user.getType()==User.CLIENT){
			List<Order> li=Odi.queryHForList("flag",OrderDaoImpl.running);
			session.setAttribute("selectRunning", li);
		}
		if(user.getType()==User.DRIVER){
			List<Order> li=Odi.queryCForList("flag",OrderDaoImpl.running);
			session.setAttribute("selectRunning", li);
		}
		response.sendRedirect("personal_order_running.jsp");
	}
		
		//��ѯ����Ŀ�ĵض���
		public void selectArrive(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException  {
			HttpSession session=request.getSession();
			User user=(User) session.getAttribute("user");
			OrderDaoImpl Odi=new OrderDaoImpl();
			if(user.getType()==User.CLIENT){
				List<Order> li=Odi.queryHForList("flag",OrderDaoImpl.arrive);
				session.setAttribute("selectArrive", li);
			}
			if(user.getType()==User.DRIVER){
				List<Order> li=Odi.queryCForList("flag",OrderDaoImpl.arrive);
				session.setAttribute("selectArrive", li);
			}
			response.sendRedirect("personal_order_running.jsp");
		}
		
		//��ѯ��ǩ�ն���
		public void selectDone(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException  {
			HttpSession session=request.getSession();
			User user=(User) session.getAttribute("user");
			OrderDaoImpl Odi=new OrderDaoImpl();
			if(user.getType()==User.CLIENT){
				List<Order> li=Odi.queryHForList("flag",OrderDaoImpl.done);
				session.setAttribute("selectDone", li);
			}
			if(user.getType()==User.DRIVER){
				List<Order> li=Odi.queryCForList("flag",OrderDaoImpl.done);
				session.setAttribute("selectDone", li);
			}
			response.sendRedirect("personal_order_done.jsp");
		}

}
