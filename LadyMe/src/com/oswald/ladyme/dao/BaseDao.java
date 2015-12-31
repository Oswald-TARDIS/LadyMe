package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.oswald.ladyme.bean.BaseBean;
import com.oswald.ladyme.bean.News;

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
	
	public boolean insert(BaseBean n) ;
	public boolean update(BaseBean n, String where, String whereSet);

}
