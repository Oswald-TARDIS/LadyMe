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
import com.oswald.ladyme.bean.Corder;
import com.oswald.ladyme.bean.HUser;
import com.oswald.ladyme.bean.Horder;
import com.oswald.ladyme.bean.User;
import com.oswald.ladyme.dao.CorderDaoImpl;
import com.oswald.ladyme.dao.CuserDaoImpl;
import com.oswald.ladyme.dao.HorderDaoImpl;
import com.oswald.ladyme.dao.HuserDaoImpl;
import com.oswald.ladyme.tools.DataBase;

public class OrderService {
	public final static String uconfirm = "uconfirm";
	public final static String running = "running";
	public final static String done = "done";
	
	public void selectUC(HttpServletRequest request, HttpServletResponse response) throws SQLException  {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		HorderDaoImpl hdi=new HorderDaoImpl();
		CorderDaoImpl cdi=new CorderDaoImpl();
		if(user.getType()==User.CLIENT){
			List<Horder> li=hdi.queryForList(uconfirm);
			session.setAttribute("selectResult", li);
		}
		if(user.getType()==User.DRIVER){
			List<Corder> li=cdi.queryForList(uconfirm);
			session.setAttribute("selectResult", li);
		}
	}
	public void selectRunning(HttpServletRequest request, HttpServletResponse response) throws SQLException  {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		HorderDaoImpl hdi=new HorderDaoImpl();
		CorderDaoImpl cdi=new CorderDaoImpl();
		if(user.getType()==User.CLIENT){
			List<Horder> li=hdi.queryForList(running);
			session.setAttribute("selectResult", li);
		}
		if(user.getType()==User.DRIVER){
			List<Corder> li=cdi.queryForList(running);
			session.setAttribute("selectResult", li);
		}
	}
	public void selectDone(HttpServletRequest request, HttpServletResponse response) throws SQLException  {
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		HorderDaoImpl hdi=new HorderDaoImpl();
		CorderDaoImpl cdi=new CorderDaoImpl();
		if(user.getType()==User.CLIENT){
			List<Horder> li=hdi.queryForList(done);
			session.setAttribute("selectResult", li);
		}
		if(user.getType()==User.DRIVER){
			List<Corder> li=cdi.queryForList(done);
			session.setAttribute("selectResult", li);
		}
	}
	

}
