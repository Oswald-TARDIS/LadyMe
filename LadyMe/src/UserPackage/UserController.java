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
import javax.servlet.http.HttpSession;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import Bean.User;
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
		request.setCharacterEncoding("UTF-8");
		//response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		System.out.println(action);
		try {
			if (action.equals("signIn")) signIn(request, response);
			if (action.equals("logIn")) logIn(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void logIn(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String ID=request.getParameter("id");
		String type = request.getParameter("type");
		System.out.println(type);
		String pwd= request.getParameter("passwd");
		ResultSet rs=null;
		ResultSet rs2=null;
		if(type.equals("司机")){
			rs=db.query("c_user", "id",ID);
			rs2=db.query("c_user", "name", ID);
		}else{
			rs=db.query("h_user", "id",ID);
			rs2=db.query("h_user", "name", ID);
		}
		if(rs.next()){
			if(rs.getString("passwd").equals(pwd))
			{
				User user=new User();
				user.setID(ID);
				user.setName(rs.getString("name"));
				session.setAttribute("user", user);
				response.sendRedirect("index.jsp");
				return;
			}else{
				System.out.println("密码错误");
			}
		}else if(rs2.next()){
			if(rs2.getString("passwd").equals(pwd))
			{
				User user=new User();
				user.setID(ID);
				user.setName(rs2.getString("name"));
				session.setAttribute("user", user);
				response.sendRedirect("index.jsp");
				return;
			}else{
				System.out.println("密码错误");
			}
		}else{
			System.out.println("用户不存在");
		}
	}

	private void signIn(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String pwd=request.getParameter("passwd");
		boolean flag=false;
		ResultSet rs=null;
		String ID=null;
		HashMap<String,Object> map=new HashMap<>();
		if (type.equals("司机")) {
			rs=db.query("c_user", null, null);
			rs.last();
			int count=rs.getRow()+10000;
			ID = "C" +count ;
		} else {
			rs=db.query("h_user", null, null);
			rs.last();
			int count=rs.getRow()+10000;
			ID = "H"+ count;
		}
		boolean hasName=false;
		rs =db.query("c_user", "name", name);
		if(rs.next())	hasName=true;
		rs =db.query("h_user", "name", name);
		if(rs.next())	hasName=true;
		if(hasName){
			System.out.println("用户名已存在");
			return;
		}
		rs.close();
		map.put("id", ID);
		map.put("name", name);
		map.put("passwd",pwd);
		if (type.equals("司机")) {
			flag=db.insert("c_user", map);
			System.out.println(flag);
		} else {
			flag=db.insert("h_user", map);
			System.out.println(flag);
		}
		if(flag)
			System.out.println("你的ID:"+ID);
		else
			System.out.println("注册失败");
	}
}
