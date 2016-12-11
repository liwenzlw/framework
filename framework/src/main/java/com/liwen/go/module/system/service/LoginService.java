package com.liwen.go.module.system.service;

import com.liwen.go.module.right.bean.User;

public interface LoginService {

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return 数据库以存在该用户返回false，否则true
	 */
	boolean register(User user);
}
