package com.liwen.go.demo.email.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import com.liwen.go.demo.email.bean.Sender;

public class SendMailUtil {
	public static void sendSimpleTextEmail(Sender sender, String content, String[] receivers) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName(sender.getHostname());
		email.setSmtpPort(sender.getSmtpport());
		email.setAuthenticator(new DefaultAuthenticator(sender.getUsername(), sender.getPassword()));
		email.setSSLOnConnect(true);
		email.setFrom(sender.getUsername(), sender.getName());
		email.setSubject("Hi湖南项目监控警报邮件");
		email.setMsg(content);
		email.addTo(receivers);
		email.send();
	}
}
