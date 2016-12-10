package com.liwen.go.module.right.mapper;

import java.util.List;

import com.liwen.go.module.right.bean.Menu;

public interface MenuDao {
	Menu selectByPrimaryKey(Integer menuId);

	/**
	 * 查找所有的菜单
	 * @return
	 */
	List<Menu> selectAllMenus();
}