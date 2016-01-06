package com.oswald.ladyme.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oswald.ladyme.bean.User;
import com.oswald.ladyme.service.OrderService;
import com.oswald.ladyme.service.UserService;
import com.oswald.ladyme.tools.DataBase;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

/**
 * Servlet implementation class OrderController
 */
@WebServlet("/OrderController")

public class OrderController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	DataBase db = new DataBase();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		System.out.println(action);
		try {
			OrderService service = new OrderService();
		if (action.equals("selectUncofirm")) service.selectUncofirm(request, response);
		if (action.equals("selectRunning")) service.selectRunning(request, response);
		if (action.equals("selectArrive")) service.selectArrive(request, response);
		if (action.equals("selectDone")) service.selectDone(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
