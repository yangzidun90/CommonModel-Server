package com.ysj.server.model;

public class GeneralModel {
	/**
	 * 主键.
	 */
	private String id;
	/**
	 * 数据库操作状态. 新增：0,修改：1,删除：2
	 */
	private int dataState;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDataState() {
		return dataState;
	}
	public void setDataState(int dataState) {
		this.dataState = dataState;
	}
	

}
