package UserPackage;

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

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import sun.java2d.pipe.SpanShapeRenderer.Simple;
import tools.DataBase;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DataBase db = new DataBase();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = (String) request.getParameter("action");
		try {
			if (action.equals("signIn")) signIn(request, response);
			if (action.equals("logIn")) logIn(request, response);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void logIn(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void signIn(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String pwd=request.getParameter("passwd");
		boolean flag = true;
		String ID=null;
		HashMap<String,Object> map=new HashMap<>();
		while (flag) {
			int ran = (int) (Math.random() * 80000 + 10000);
			java.util.Date d = new java.util.Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			ID = sdf.format(d) + ran;
			if (type.equals("˾��")) {
				ID = "C" + ID;
				ResultSet rs = db.query("c_user", "id", ID);
				if (!rs.next()) flag = false;
			} else {
				ID = "H" + ID;
				ResultSet rs = db.query("h_user", "id", ID);
				if (!rs.next()) flag = false;
			}
		}
		if (type.equals("˾��")) {
			map.put("id", ID);
			map.put("Cname", name);
			map.put("passwd",pwd);
			db.insert("c_user", map);
		} else {
			map.put("id", ID);
			map.put("Hname", name);
			map.put("passwd",pwd);
			db.insert("h_user", map);
		}
		
	}
}
