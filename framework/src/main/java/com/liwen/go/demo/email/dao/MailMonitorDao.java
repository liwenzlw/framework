package com.liwen.go.demo.email.dao;

import java.util.List;
import java.util.Map;

import com.liwen.go.demo.email.bean.MailMonitor;
import com.liwen.go.demo.email.bean.Sender;

public interface MailMonitorDao {

	/**
	 * 获取监控项
	 * 
	 * @return
	 */
	public List<MailMonitor> selectMonitorItems();

	/**
	 * 根据监控Sql语句获取警告参数集合
	 * 
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> selectWarnParamsByMonitorSql(Map<String, Object> params);

	/**
	 * 获取发件人邮箱信息
	 * 
	 * @return
	 */
	public Sender selectSender();

	/**
	 * 获取收件人邮箱用户名
	 * 
	 * @return
	 */
	public List<String> selectReceivers();
}
