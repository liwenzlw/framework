package com.liwen.go.module.authz.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwen.go.module.authz.bean.User;
import com.liwen.go.module.authz.dao.UserMapper;
import com.liwen.go.module.authz.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User createUser(User user) {
		return userMapper.createUser(user);
	}

	@Override
	public void changePassword(Long userId, String newPassword) {
		User user = userMapper.findOne(userId);
		user.setPassword(newPassword);
		userMapper.updateUser(user);
	}

	@Override
	public void correlationRoles(Long userId, Long... roleIds) {
		userMapper.correlationRoles(userId, roleIds);
	}

	@Override
	public void uncorrelationRoles(Long userId, Long... roleIds) {
		userMapper.uncorrelationRoles(userId, roleIds);
	}

	@Override
	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}

	@Override
	public Set<String> findRoles(String username) {
		return userMapper.findRoles(username);
	}

	@Override
	public Set<String> findPermissions(String username) {
		return userMapper.findPermissions(username);
	}

}
