package com.ysj.server.util;

import java.util.ArrayList;
import java.util.List;

public class ModelConstr {
	/**
	 * 数据新增状态.
	 */
	public static final int DB_DATA_STATUS_ADD=0;
	
	/**
	 * 数据新增修改.
	 */
	public static final int DB_DATA_STATUS_UPDATE=1;
	
	/**
	 * 数据新增删除.
	 */
	public static final int DB_DATA_STATUS_DELETE=2;
	
	
	/**
	 * 数据类型.
	 */
	public static final List<String> DB_DATA_TYPE=new ArrayList<String>();
	static{
		DB_DATA_TYPE.add("NUMBER");
		DB_DATA_TYPE.add("VARCHAR");
		DB_DATA_TYPE.add("DATE");
	}
	
}