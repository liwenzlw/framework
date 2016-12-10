package com.liwen.go.module.right.mapper;

import com.liwen.go.module.right.bean.User;

public interface UserDao {
	User selectByPrimaryKey(Integer userId);

	/**
	 * 通过登录名查找用户信息
	 * 
	 * @param username
	 * @return
	 */
	User selectByUsername(String username);
}