package com.liwen.go.demo.email.demo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * 使用163的smtp服务器发送邮件
 * 
 * @author liwen
 *
 */
public class SendSimpleTextEmail {

	public static void main(String[] args) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.163.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("liwenzlw@163.com", "xxxxx邮箱密码xxxxxxxx"));
		email.setSSLOnConnect(true);
		email.setFrom("liwenzlw@163.com", "利文");
		email.setSubject("异常信息");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("1309928657@qq.com");
		email.send();
	}
}
