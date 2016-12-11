package com.liwen.go.module.right.realm;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 * 修改默认的表单验证过滤器
 * 修改项包括：
 * 	1.用户登录后，再次登录时界面进行跳转（默认行为为：用户登录以后，再次登录后仍然停留在登录界面）
 * </pre>
 * 
 * @author jimboi
 *
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

	private static final Logger log = LoggerFactory.getLogger(MyFormAuthenticationFilter.class);

	@Override
	public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		return onAccessDenied(request, response);
	}
}
