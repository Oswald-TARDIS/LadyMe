package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.util.HashMap;

public interface BaseDao {
	/*
	 * ��ҳ��ѯ
	 */
	ResultSet query(int beginIndex, int pageSize);

	/*
	 * ��ѯ
	 */
	ResultSet query(String where, Object whereSet);

	/*
	 * ����
	 */
	boolean insert(HashMap<String, Object> map);

	/*
	 * ɾ��
	 */
	boolean delete(String where, Object whereSet);

	/*
	 * 
	 */
	boolean update(HashMap<String, Object> map, String where, Object whereSet);

}
