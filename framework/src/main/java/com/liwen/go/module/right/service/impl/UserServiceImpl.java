package com.liwen.go.module.right.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwen.go.module.right.bean.Role;
import com.liwen.go.module.right.bean.User;
import com.liwen.go.module.right.mapper.UserMapper;
import com.liwen.go.module.right.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public User selectByUserName(String userName) {
		return userMapper.selectByUserName(userName);
	}

	@Override
	public Role selectRoleByUserName(String userName) {
		return userMapper.selectRoleByUserName(userName);
	}

	@Override
	public Boolean insertOneUser(User user) {
		int count = userMapper.insertOneUser(user);
		return count==1;
	}
}
