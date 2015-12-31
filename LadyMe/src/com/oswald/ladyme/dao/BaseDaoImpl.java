package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.oswald.ladyme.bean.BaseBean;
import com.oswald.ladyme.bean.News;
import com.oswald.ladyme.tools.DataBase;

public class BaseDaoImpl implements BaseDao {
	String table;
	DataBase db;

	public BaseDaoImpl(String table) {
		// TODO Auto-generated constructor stub
		this.table = table;
		db = new DataBase();
	}

	public ResultSet query(String where, Object whereSet) {
		// TODO Auto-generated method stub
		return db.query(table, where, whereSet);
	}

	@Override
	public boolean insert(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return db.insert(table, map);
	}

	@Override
	public boolean delete(String where, Object whereSet) {
		// TODO Auto-generated method stub
		return db.delete(table, where, whereSet);
	}

	@Override
	public boolean update(HashMap<String, Object> map, String where, Object whereSet) {
		// TODO Auto-generated method stub
		return db.update(table, map, where, whereSet);
	}

	public int getRow() throws SQLException {
		ResultSet rs = db.query(table, null, null);
		rs.last();
		return rs.getRow();

	}

	@Override
	public ResultSet query(int beginIndex, int pageSize) {
		// TODO Auto-generated method stub
		return db.query(table, beginIndex, pageSize);
	}
	
	public boolean insert(BaseBean n) {
		return db.insert(table, n.toMap());
	}
	public boolean update(BaseBean n, String where, String whereSet) {
		return db.update(table, n.toMap(), where, whereSet);
	}
}
