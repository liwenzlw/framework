package com.liwen.go.module.rights.bean;

/**
 * 系统角色
 * 
 * @author jimboi
 *
 */
public class Role {
	private Integer roleId;

	private String roleName;// 角色名

	private String menuRights;// 菜单权限

	private String gridAddRights;// 表格增加权限

	private String gridDelRights;// 表格删除权限

	private String gridUpdateRights;// 表格更新权限

	private String gridReadRights;// 表格读取权限

	private String buttonRights;// 按钮权限

	private String onOffRights;// 开关权限

	private Integer groupId;// 角色组id

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	public String getMenuRights() {
		return menuRights;
	}

	public void setMenuRights(String menuRights) {
		this.menuRights = menuRights == null ? null : menuRights.trim();
	}

	public String getGridAddRights() {
		return gridAddRights;
	}

	public void setGridAddRights(String gridAddRights) {
		this.gridAddRights = gridAddRights == null ? null : gridAddRights.trim();
	}

	public String getGridDelRights() {
		return gridDelRights;
	}

	public void setGridDelRights(String gridDelRights) {
		this.gridDelRights = gridDelRights == null ? null : gridDelRights.trim();
	}

	public String getGridUpdateRights() {
		return gridUpdateRights;
	}

	public void setGridUpdateRights(String gridUpdateRights) {
		this.gridUpdateRights = gridUpdateRights == null ? null : gridUpdateRights.trim();
	}

	public String getGridReadRights() {
		return gridReadRights;
	}

	public void setGridReadRights(String gridReadRights) {
		this.gridReadRights = gridReadRights == null ? null : gridReadRights.trim();
	}

	public String getButtonRights() {
		return buttonRights;
	}

	public void setButtonRights(String buttonRights) {
		this.buttonRights = buttonRights == null ? null : buttonRights.trim();
	}

	public String getOnOffRights() {
		return onOffRights;
	}

	public void setOnOffRights(String onOffRights) {
		this.onOffRights = onOffRights == null ? null : onOffRights.trim();
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
}