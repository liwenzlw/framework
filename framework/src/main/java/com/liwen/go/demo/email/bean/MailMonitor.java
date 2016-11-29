package com.liwen.go.demo.email.bean;

/**
 * 监控信息
 * 
 */
public class MailMonitor {
	private String id;
	// 监控sql语句
	private String sql;
	// 发送给用户的邮件
	private String tip;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
}
