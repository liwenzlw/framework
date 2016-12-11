package com.liwen.go.module.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.liwen.go.module.right.bean.User;
import com.liwen.go.module.right.tool.PasswordHelper;
import com.liwen.go.module.system.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private LoginService loginService;

	@PostMapping("/register")
	public String register(@RequestParam(required = true) String username,
			@RequestParam(required = true) String password, @RequestParam(required = true) String email,
			Model model) {

		logger.trace("username:{};password:{};email:{}", username, password, email);
		User user = new User(username, password, email);
		PasswordHelper passwordHelper = new PasswordHelper();
		passwordHelper.encryptPassword(user);
		boolean flag = loginService.register(user);
		JSONObject json = new JSONObject();
		if (!flag) {
			json.put("code", "40");
			json.put("msg", "注册失败：用户名已经存在");
		} else {
			json.put("code", "20");
			json.put("msg", "注册成功");
		}
		return json.toJSONString();
	}
}
