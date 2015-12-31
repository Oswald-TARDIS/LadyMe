package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.util.HashMap;

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

}
