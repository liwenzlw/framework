package com.liwen.go.demo.email.service.serviceImpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.mail.EmailException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liwen.go.demo.email.bean.MailMonitor;
import com.liwen.go.demo.email.bean.Sender;
import com.liwen.go.demo.email.dao.MailMonitorDao;
import com.liwen.go.demo.email.service.MonitorService;
import com.liwen.go.demo.email.util.SendMailUtil;

@Service
@Transactional(readOnly = true)
public class MonitorServiceImpl implements MonitorService {

	private static Logger logger = LoggerFactory.getLogger(MonitorServiceImpl.class);
	@Autowired
	private MailMonitorDao mailMonitorDao;

	@Override
	public void monitor() {
		Map<String, Object> params = new HashMap<String, Object>();
		// 1.获取监控项
		List<MailMonitor> selectMonitorValue = mailMonitorDao.selectMonitorItems();
		// 2.获取每个监控项返回的监控警告信息
		StringBuilder sb = new StringBuilder();
		for (MailMonitor mailMonitor : selectMonitorValue) {
			params.put("sql", mailMonitor.getSql());
			List<Map<String, Object>> selectWarnParamsByMonitorSql = mailMonitorDao
					.selectWarnParamsByMonitorSql(params);
			String tipModel = mailMonitor.getTip();
			String tipModelTemp = "";
			for (Map<String, Object> warn : selectWarnParamsByMonitorSql) {
				// 3.拼接邮件发送内容
				Set<String> keySet = warn.keySet();
				Iterator<String> iterator = keySet.iterator();
				String key = "";
				tipModelTemp = tipModel;
				while (iterator.hasNext()) {
					key = iterator.next();
					tipModelTemp = tipModelTemp.replace(key, String.valueOf(warn.get(key)));
				}
				sb.append(tipModelTemp + "\n");
			}
		}
		if (sb.length() != 0) {
			// 4.将每个警告通过邮件发送
			// 4.1获取发件人邮箱
			Sender sender = mailMonitorDao.selectSender();
			// 4.2获取收件人邮箱
			List<String> selectReceivers = mailMonitorDao.selectReceivers();
			// 4.3发送邮件
			try {
				SendMailUtil.sendSimpleTextEmail(sender, sb.toString(), selectReceivers.toArray(new String[0]));
			} catch (EmailException e) {
				logger.error("发送邮件异常：{}", e.getMessage());
				logger.error("发送邮件异常，发送的邮件内容为：{}", sb.toString());
				e.printStackTrace();
			}
		}
	}
}
