package com.oswald.ladyme.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.fabric.xmlrpc.base.Array;
import com.oswald.ladyme.bean.News;
import com.oswald.ladyme.dao.CnewsDaoImpl;
import com.oswald.ladyme.dao.InnewsDaoImpl;

public class NewsService {
 CnewsDaoImpl csdi;
 HttpServletRequest request;
 HttpServletResponse response;
 InnewsDaoImpl indi;
 
 public NewsService(HttpServletRequest request, HttpServletResponse response){
	 this.request=request;
	 this.response=response;
	 csdi=new CnewsDaoImpl();
	 indi=new InnewsDaoImpl();
 }
 
public void query() throws SQLException, IOException {
	// TODO Auto-generated method stub
	List<News> li=new ArrayList<News>();
	 HttpSession session=request.getSession();
	 li=indi.queryForList(0, 7);
	 session.setAttribute("inNews",li);
	 li=new ArrayList<News>();
	 li=csdi.queryForList(0, 7);
	 session.setAttribute("coNews", li);
	 response.sendRedirect("index.jsp");
}
}
