package com.ysj.server.model;

import java.util.Date;
import java.util.List;

public class DxModel extends GeneralModel {
	/**
	 * 模型类型.
	 */
	private String modelType;
	/**
	 * 模型名称.
	 */
	private String modelName;
	/**
	 * 创建时间.
	 */
	private Date createTime;
	/**
	 * 最后修改时间.
	 */
	private Date lastTime;
	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public List<ColumnModel> getPropers() {
		return propers;
	}

	public void setPropers(List<ColumnModel> propers) {
		this.propers = propers;
	}

	/**
	 * 状态（启用，停用）.
	 */
	private int state;
	
	/**
	 * 属性列表.
	 */
	private List<ColumnModel> propers;

}
