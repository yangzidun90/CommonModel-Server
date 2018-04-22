package com.ysj.server.model;

public class ResultMessage {
	/**
	 * 返回消息.
	 */
	private String messge;
	/**
	 * 返回代码.
	 */
	private String returnCode;
	/**
	 * 返回结果.
	 */
	private Object resultObj;
	public String getMessge() {
		return messge;
	}
	public void setMessge(String messge) {
		this.messge = messge;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public Object getResultObj() {
		return resultObj;
	}
	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}
	
}
