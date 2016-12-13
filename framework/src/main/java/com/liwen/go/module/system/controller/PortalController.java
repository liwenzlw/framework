package com.liwen.go.module.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liwen.go.module.right.bean.Menu;
import com.liwen.go.module.right.service.MenuService;

/**
 * 首页中的侧边栏等控制器
 * 
 * @author jimboi
 *
 */
@Controller
@RequestMapping("/portal")
public class PortalController {

	@Autowired
	private MenuService menuService;

	@RequestMapping("/main")
	public ModelAndView protal() {
		return getMenus();
	}
	
	@PostMapping("/menus")
	public ModelAndView getMenus() {
		List<Menu> menus = menuService.selectAllMenusAndFormat();
		ModelAndView mv = new ModelAndView();
		mv.addObject("menus", menus);
		mv.setViewName("layout/main");
		return mv;
	}
}
