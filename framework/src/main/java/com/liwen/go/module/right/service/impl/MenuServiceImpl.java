package com.liwen.go.module.right.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.subject.support.DefaultWebSubjectContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwen.go.module.right.bean.Menu;
import com.liwen.go.module.right.mapper.MenuMapper;
import com.liwen.go.module.right.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;

	@Override
	public List<Menu> selectAllMenusAndFormat() {

		// 查询出所有的菜单
		List<Menu> menus = menuMapper.selectAllMenus();
		// 返回的结构化的菜单
		List<Menu> formatMenus = new ArrayList<>();
		// 将菜单父子结构化
		Integer parentId = null;
		Integer menuId = null;
		for (Menu menu : menus) {
			parentId = menu.getParentId();
			if (parentId != 0) {
				for (Menu menu2 : menus) {
					menuId = menu2.getMenuId();
					if (parentId == menuId) {
						menu2.getSubMenus().add(menu);
					}
				}
			}
		}
		// 格式化返回菜单集合
		for (Menu menu : menus) {
			if (menu.getParentId() == 0) {
				formatMenus.add(menu);
			}
		}
		return formatMenus;
	}
}
