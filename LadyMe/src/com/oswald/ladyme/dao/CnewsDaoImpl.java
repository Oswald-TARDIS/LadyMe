package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oswald.ladyme.bean.News;

public class CnewsDaoImpl extends BaseDaoImpl {
	public final static String theTable = "co_news";

	public CnewsDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}

	public boolean insert(News n) {
		return super.insert(n.toMap());
	}

	public boolean update(News n, String where, String whereSet) {
		return super.update(n.toMap(), where, whereSet);
	}

	public List<News> queryForList(String where, String whereSet) throws SQLException {
		ResultSet rs = super.query(where, whereSet);
		List<News> li = new ArrayList<>();
		while (rs.next()) {
			News n = new News();
			n.setTitle(rs.getString("title"));
			n.setTime(rs.getString("time"));
			n.setAuther(rs.getString("auther"));
			li.add(n);
		}
		return li;
	}

	public List<News> queryForList(int beginIndex, int pageSize) throws SQLException {
		ResultSet rs = super.query(beginIndex, pageSize);
		List<News> li = new ArrayList<>();
		while (rs.next()) {
			News n = new News();
			n.setTitle(rs.getString("title"));
			n.setTime(rs.getString("time"));
			n.setAuther(rs.getString("auther"));
			li.add(n);
		}
		return li;
	}
}
