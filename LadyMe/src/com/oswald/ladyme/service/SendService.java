package com.oswald.ladyme.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oswald.ladyme.bean.News;
import com.oswald.ladyme.bean.Sendgoods;
import com.oswald.ladyme.dao.CnewsDaoImpl;
import com.oswald.ladyme.dao.InnewsDaoImpl;
import com.oswald.ladyme.dao.SendgoodDaoImpl;
import com.oswald.ladyme.dao.SendvehicleDaoImpl;

public class SendService {
	SendgoodDaoImpl sgdi;
	SendvehicleDaoImpl svdi;
	HttpServletRequest request;
	HttpServletResponse response;
	

	public SendService(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		svdi = new SendvehicleDaoImpl();
		sgdi = new SendgoodDaoImpl();
	}

	public void query(ServletContext application) throws SQLException, IOException {
		// TODO Auto-generated method stub
		List<Sendgoods> li = new ArrayList<>();
		 li=sgdi.queryForList(0, 7);
		application.setAttribute("infoSupply", li);
		response.sendRedirect("index.jsp");
	}

}
