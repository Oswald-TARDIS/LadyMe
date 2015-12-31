package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oswald.ladyme.bean.News;

public class InnewsDaoImpl extends BaseDaoImpl {
	public final static String theTable = "in_news";

	public InnewsDaoImpl() {
		super(theTable);
		// TODO Auto-generated constructor stub
	}

	public List<News> queryForList(int beginIndex, int pageSize) throws SQLException {
		ResultSet rs = super.query(beginIndex, pageSize);
		List<News> li = new ArrayList<>();
		while (rs.next()) {
			News n = new News();
			n.setId(rs.getInt("id"));
			n.setTitle(rs.getString("title"));
			n.setTime(rs.getString("time"));
			n.setAuther(rs.getString("auther"));
			li.add(n);
		}
		return li;
	}
}
