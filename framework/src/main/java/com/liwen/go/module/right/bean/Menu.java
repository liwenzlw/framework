package com.liwen.go.module.right.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 界面侧边栏菜单
 * 
 * @author jimboi
 *
 */
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer menuId;

	private String menuName;// 菜单名

	private String menuUrl;// 菜单点击访问url

	private Integer parentId;// 父菜单id

	private Integer menuOrder;// 菜单顺序编号

	private String menuIcon;// 菜单图标

	private Menu parentMenu;// 父菜单
	
	private List<Menu> subMenus = new ArrayList<Menu>();// 子菜单

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName == null ? null : menuName.trim();
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl == null ? null : menuUrl.trim();
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon == null ? null : menuIcon.trim();
	}

	public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}
}