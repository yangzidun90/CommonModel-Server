package com.ysj.server.model;

import java.util.List;

public class ColumnModel extends GeneralModel {
	/**
	 * 中文名称.
	 */
	private String chName;
	/**
	 * 字段名称.
	 */
	private String dbName;
	/**
	 * 字段类型.
	 */
	private String dbType;
	/**
	 * 字段长度.
	 */
	private int dbLength;
	/**
	 * 字段精度.
	 */
	private int dbPrecision;
	/**
	 * 状态（启用，停用）.
	 */
	private int state;
	/**
	 * 模型ID.
	 */
	private String modelId;
	
	/**
	 * 下级属性.
	 */
	private List<ColumnModel> childProps;

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	
	public int getDbLength() {
		return dbLength;
	}

	public void setDbLength(int dbLength) {
		this.dbLength = dbLength;
	}

	public int getDbPrecision() {
		return dbPrecision;
	}

	public void setDbPrecision(int dbPrecision) {
		this.dbPrecision = dbPrecision;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public List<ColumnModel> getChildProps() {
		return childProps;
	}

	public void setChildProps(List<ColumnModel> childProps) {
		this.childProps = childProps;
	}

}
