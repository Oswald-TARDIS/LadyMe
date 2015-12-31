package com.oswald.ladyme.dao;

import java.sql.ResultSet;
import java.util.HashMap;


public interface BaseDao {
	/*
	 * ≤È—Ø
	 */
	ResultSet query(String where,Object whereSet);
	/*
	 * ≤Â»Î
	 */
	boolean insert(HashMap<String,Object> map);
	/*
	 * …æ≥˝
	 */
	boolean delete(String where,Object whereSet);
	/*
	 * 
	 */
	boolean update(HashMap<String,Object> map,String where,Object whereSet);
	
}
