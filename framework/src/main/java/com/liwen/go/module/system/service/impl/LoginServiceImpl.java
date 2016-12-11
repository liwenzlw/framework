package com.liwen.go.module.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwen.go.module.right.bean.User;
import com.liwen.go.module.right.service.UserService;
import com.liwen.go.module.system.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserService userService;
	
	@Override
	public boolean register(User user) {
		User u = userService.selectByUsername(user.getUserUsername());
		if(u == null) {
			userService.insertOneUser(user);
			return true;
		}
		return false;
	}
}
