package com.liwen.go.module.right.mapper;

import com.liwen.go.module.right.bean.Role;
import com.liwen.go.module.right.bean.User;

public interface UserMapper {
	
	User selectByPrimaryKey(Integer userId);

	/**
	 * 通过用户名查找用户信息
	 * 
	 * @param username
	 * @return
	 */
	User selectByUserName(String userName);

	/**
	 * 通过用户名查找用户权限
	 */
	Role selectRoleByUserName(String userName);

	/**
	 * 插入一个用户
	 * 
	 * @param user
	 * @return
	 */
	int insertOneUser(User user);
}