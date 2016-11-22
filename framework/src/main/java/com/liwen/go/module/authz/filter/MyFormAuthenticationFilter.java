package com.liwen.go.module.authz.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

	private static final Logger log = LoggerFactory.getLogger(MyFormAuthenticationFilter.class);

	@Override
	public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		return onAccessDenied(request, response);
	}
}
