package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.oswald.ladyme.bean.BaseBean;
import com.oswald.ladyme.bean.News;

public interface BaseDao {
	/*
	 * 分页查询
	 */
	ResultSet query(int beginIndex, int pageSize);

	/*
	 * 查询
	 */
	ResultSet query(String where, Object whereSet);

	/*
	 * 插入
	 */
	boolean insert(HashMap<String, Object> map);

	/*
	 * 删除
	 */
	boolean delete(String where, Object whereSet);

	/*
	 * 
	 */
	boolean update(HashMap<String, Object> map, String where, Object whereSet);
	
	public boolean insert(BaseBean n) ;
	public boolean update(BaseBean n, String where, String whereSet);

}
