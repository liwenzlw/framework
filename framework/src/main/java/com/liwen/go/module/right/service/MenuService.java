package com.liwen.go.module.right.service;

import java.util.List;

import com.liwen.go.module.right.bean.Menu;

public interface MenuService {

	/**
	 * 查找所有的菜单,并结构化
	 * 
	 * @return
	 */
	List<Menu> selectAllMenusAndFormat();
}
