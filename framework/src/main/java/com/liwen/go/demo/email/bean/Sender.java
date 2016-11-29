package com.liwen.go.demo.email.bean;

/**
 * 发送邮件的账号信息
 */
public class Sender {
	private String username;// 发送者邮箱用户名
	private String password;// 邮箱密码
	private String hostname;// 邮箱主机
	private Integer smtpport;// smtp服务器端口号
	private String name;// 发送者名字

	public Integer getSmtpport() {
		return smtpport;
	}

	public void setSmtpport(Integer smtpport) {
		this.smtpport = smtpport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
}
