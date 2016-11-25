package com.liwen.go.module.Demo.jsr303.web.exception;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liwen.go.module.Demo.jsr303.bean.User_jsr;

@Controller
public class UserController_jsr {
	
	@RequestMapping("/jsr303demo/userj_jsr")
	@ResponseBody
	public String jsr303Demo(@Valid User_jsr user,BindingResult br){
		if(br.hasErrors()) {
			System.out.println(br.getFieldError("name").getDefaultMessage());
		}
		System.out.println("测试JSR303:控制层校验成功");
		return "true";
	}
}
