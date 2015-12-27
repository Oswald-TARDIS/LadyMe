package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * @author Тэем 
 *  2015/11/24
 */

public class DataBase {
	private Connection conn;
	private String userName="root";
	private String pwd="123456";
	public DataBase(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/work?useUnicode=true&characterEncoding=UTF-8", userName, pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public DataBase(String dataBaseName,String userName,String pwd)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dataBaseName+"?useUnicode=true&characterEncoding=UTF-8", userName, pwd);  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public DataBase(String dataBaseName)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dataBaseName+"?useUnicode=true&characterEncoding=UTF-8", userName, pwd);  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String table,String where,Object whereSet){
		String sql="select * from "+table;
		if(where!=null&&whereSet!=null)
			sql="select * from "+table+" where "+where+"=?";
		ResultSet rs=null;
		try {
			System.out.println();
			PreparedStatement ps=conn.prepareStatement(sql);
			if(whereSet!=null)
				ps.setObject(1,whereSet);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public boolean insert(String tableName,HashMap<String,Object> map){
		Iterator iter = map.entrySet().iterator(); 
		String sql="insert into "+tableName+" (";
		List<String> keys=new ArrayList<String>();
		List<Object> vals=new ArrayList<Object>();
		 while (iter.hasNext()) { 
		     Map.Entry entry = (Map.Entry) iter.next(); 
		     String key = (String) entry.getKey(); 
		     Object val = entry.getValue(); 
		     keys.add(key);
		     vals.add(val);
		     }
		 for(int i=0;i<keys.size()-1;i++){
			 sql+=keys.get(i)+',';
		 }
		 sql+=keys.get(keys.size()-1)+") values (";
		 for(int i=0;i<vals.size()-1;i++){
			 sql+="?,";
		 }
		 sql+="?)";
		 try { 
	    	 PreparedStatement ps=conn.prepareStatement(sql);
	    	 int i=0;
	    	 for(Object val:vals){
	    		 i++;
	    		 ps.setObject(i,val);
	    	 }
	    	 return ps.execute();
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				}
		return true;
	}
	public boolean delete(String table,String where,Object whereSet){
		String sql="delete from "+table+" where "+where+"=?";
		ResultSet rs=null;
		try {
			System.out.println();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setObject(1,whereSet);
			return ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean update(String tableName,HashMap<String,Object> map,String where,Object whereSet){
		Iterator iter = map.entrySet().iterator(); 
		String sql="update "+tableName+" set ";
		List<String> keys=new ArrayList<String>();
		List<Object> vals=new ArrayList<Object>();
		 while (iter.hasNext()) { 
		     Map.Entry entry = (Map.Entry) iter.next(); 
		     String key = (String) entry.getKey(); 
		     Object val = entry.getValue(); 
		     keys.add(key);
		     vals.add(val);
		     }
		 for(int i=0;i<keys.size()-1;i++){
			 sql+=keys.get(i)+"=?,";
		 }
		 sql+=keys.get(keys.size()-1)+"=? where "+where+"=?";
		 try { 
	    	 PreparedStatement ps=conn.prepareStatement(sql);
	    	 int i=0;
	    	 for(Object val:vals){
	    		 i++;
	    		 ps.setObject(i,val);
	    	 }
	    	 ps.setObject(vals.size()+1, whereSet);
	    	 return ps.execute();
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
				}
		return true;
	}
	public Connection getConnection() {
		return conn;
	}
	
}













