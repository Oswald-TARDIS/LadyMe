package com.oswald.ladyme.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oswald.ladyme.service.SendService;

/**
 * Servlet implementation class SendgoodController
 */
@WebServlet("/SendController")
public class SendController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SendController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		SendService service = new SendService(request, response);
		int flag = 0;
		if (action.equals("query"))
			flag = 0;
		if (action.equals("insert"))
			flag = 1;
		if (action.equals("insertV"))
			flag = 2;
		if (action.equals("queryall"))
			flag = 3;
		if (action.equals("getVehiclePage"))
			flag = 4;
		if (action.equals("getGoodPage"))
			flag = 5;
		if (action.equals("getVehicle"))
			flag = 6;
		if (action.equals("getGood"))
			flag = 7;
		if (action.equals("queryallV"))
			flag = 8;
		try {
			switch (flag) {
			case 0:
				service.query(this.getServletContext());
				break;
			case 1:
				service.insert();
				break;
			case 2:
				service.insertV();
				break;
			case 3:
				service.queryall();
				break;
			case 4:
				service.getVehiclePage();
				break;
			case 5:
				service.getGoodPage();
				break;
			case 6:
				service.getVehicle();
				break;
			case 7:
				service.getGood();
				break;
			case 8:
				service.queryallV();
				break;
			default:

				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
