package com.liwen.go.module.right.service;

import com.liwen.go.module.right.bean.User;

public interface UserService {
	User selectByPrimaryKey(Integer userId);

	/**
	 * 通过登录名查找用户信息
	 * 
	 * @param username
	 * @return
	 */
	User selectByUsername(String username);
}
