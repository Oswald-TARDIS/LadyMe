package com.oswald.ladyme.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.oswald.ladyme.bean.CUser;
import com.oswald.ladyme.bean.HUser;
import com.oswald.ladyme.bean.User;
import com.oswald.ladyme.dao.CuserDaoImpl;
import com.oswald.ladyme.dao.HuserDaoImpl;
import com.oswald.ladyme.tools.DataBase;

public class UserService {
	CuserDaoImpl cdi;
	HuserDaoImpl hdi;
	public UserService(){
		cdi=new CuserDaoImpl();
		hdi=new HuserDaoImpl();
	}
	public void logIn(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String ID=request.getParameter("id");
		String type = request.getParameter("type");
		String pwd= request.getParameter("passwd");
		ResultSet rs=null;
		ResultSet rs2=null;
		User user=new User();
		if(type.equals("司机")){
			 
			rs=cdi.query("id", ID);
			rs2=cdi.query("name", ID);
			user.setType(User.DRIVER);
		}else{
			rs=hdi.query("id",ID);
			rs2=hdi.query("name", ID);
			user.setType(User.CLIENT);
		}
		if(rs.next()){
			if(rs.getString("passwd").equals(pwd))
			{
				user.setID(rs.getString("id"));
				user.setName(rs.getString("name"));
				session.setAttribute("user", user);
				session.setAttribute("logError", null);
				response.sendRedirect("index.jsp");
				return;
			}else{
				session.setAttribute("logError", "密码错误");
			}
		}else if(rs2.next()){
			if(rs2.getString("passwd").equals(pwd))
			{
				user.setID(rs2.getString("id"));
				user.setName(rs2.getString("name"));
				session.setAttribute("user", user);
				session.setAttribute("logError", null);
				response.sendRedirect("index.jsp");
				return;
			}else{
				session.setAttribute("logError", "密码错误");
			}
		}else{
			session.setAttribute("logError", "用户不存在");
		}
		response.sendRedirect("login.jsp");
	}

	public void signIn(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String pwd=request.getParameter("passwd");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		boolean flag=false;
		ResultSet rs=null;
		String ID=null;
		if (type.equals("司机")) {
			int count=cdi.getRow()+10000;
			ID = "C" +count ;
		} else {
			int count=hdi.getRow()+10000;
			ID = "H"+ count;
		}
		boolean hasName=false;
		rs =cdi.query("name", name);
		if(rs.next())	hasName=true;
		rs =hdi.query("name", name);
		if(rs.next())	hasName=true;
		if(hasName){
			session.setAttribute("regError", "用户名已存在");
			response.sendRedirect("register.jsp");
			return;
		}
		rs.close();
		if (type.equals("司机")) {
			CUser u=new CUser();
			u.setID(ID);
			u.setName(name);
			u.setPasswd(pwd);
			flag=cdi.insert(u);
		} else {
			HUser u=new HUser();
			u.setID(ID);
			u.setName(name);
			u.setPasswd(pwd);
			flag=hdi.insert(u);
		}
		session.setAttribute("regError", null);
		if(flag){
			out.print("请牢记您的ID:"+ID+"<br>");
			out.print("<a href='login.jsp'>点击登录</a>");
		}
		else
			out.print("注册失败");
		out.print("<a href='index.jsp'>点击返回</a>");
	}
	
	public void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session=request.getSession();
		session.setAttribute("user", null);
		response.sendRedirect("index.jsp");
		return;
	}
}
