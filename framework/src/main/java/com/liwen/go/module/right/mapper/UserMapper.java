package com.liwen.go.module.right.mapper;

import com.liwen.go.module.right.bean.Role;
import com.liwen.go.module.right.bean.User;

public interface UserMapper {
	User selectByPrimaryKey(Integer userId);

	/**
	 * 通过登录名查找用户信息
	 * 
	 * @param username
	 * @return
	 */
	User selectByUsername(String username);

	/**
	 * 通过用户名查找用户权限
	 */
	Role selectRoleByUsername(String username);

	/**
	 * 插入一个用户
	 * 
	 * @param user
	 * @return
	 */
	int insertOneUser(User user);
}