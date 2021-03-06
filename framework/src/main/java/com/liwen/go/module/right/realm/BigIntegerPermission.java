package com.liwen.go.module.right.realm;

import java.io.Serializable;
import java.math.BigInteger;

import org.apache.shiro.authz.Permission;

/**
 * 基于BigInteger的权限类
 * 
 * <pre>
 * 		权限表示：
 * 			menu:menuId  如：（menu:10）
 * 			gridAdd:gridId  如：（gridAdd:12）
 * 			onOff:id  如：（onOff:8）
 * </pre>
 * 
 * @author jimboi
 *
 */
public class BigIntegerPermission implements Permission,Serializable {

	private static final long serialVersionUID = 1L;
	
	private BigInteger menusSumRights;// 菜单总权限
	private BigInteger gridAddSumRights;// grid添加总权限
	private BigInteger gridDelSumRights;// grid删除总权限
	private BigInteger gridUpdateSumRights;// grid修改总权限
	private BigInteger gridReadSumRights;// grid读取总权限
	private BigInteger onOffSumRights;// 开关总权限
	private String permissionString;// 待校验权限字符串

	public BigIntegerPermission(BigInteger menusSumRights, BigInteger gridAddSumRights, BigInteger gridDelSumRights,
			BigInteger gridReadSumRights, BigInteger gridUpdateSumRights, BigInteger onOffSumRights) {
		this.menusSumRights = menusSumRights;
		this.gridAddSumRights = gridAddSumRights;
		this.gridDelSumRights = gridDelSumRights;
		this.gridUpdateSumRights = gridUpdateSumRights;
		this.gridReadSumRights = gridReadSumRights;
		this.onOffSumRights = onOffSumRights;
	}

	public BigIntegerPermission(String menusSumRights, String gridAddSumRights, String gridDelSumRights,
			String gridReadSumRights, String gridUpdateSumRights, String onOffSumRights) {
		this.menusSumRights = new BigInteger(menusSumRights == null ? "0" : menusSumRights);
		this.gridAddSumRights = new BigInteger(gridAddSumRights == null ? "0" : gridAddSumRights);
		this.gridDelSumRights = new BigInteger(gridDelSumRights == null ? "0" : gridDelSumRights);
		this.gridUpdateSumRights = new BigInteger(gridUpdateSumRights == null ? "0" : gridUpdateSumRights);
		this.gridReadSumRights = new BigInteger(gridReadSumRights == null ? "0" : gridReadSumRights);
		this.onOffSumRights = new BigInteger(onOffSumRights == null ? "0" : onOffSumRights);
	}

	public BigIntegerPermission(String permissionString) {
		this.permissionString = permissionString;
	}

	@Override
	public boolean implies(Permission p) {
		BigIntegerPermission bp = (BigIntegerPermission) p;
		String permissionString = bp.permissionString;
		String[] parts = permissionString.split(":");
		String rightType = parts[0];
		int targetRight = Integer.valueOf(parts[1]);
		switch (rightType) {
		case "menu":
			return menusSumRights.testBit(targetRight);
		case "gridAdd":
			return gridAddSumRights.testBit(targetRight);
		case "gridDel":
			return gridDelSumRights.testBit(targetRight);
		case "gridUpdate":
			return gridUpdateSumRights.testBit(targetRight);
		case "gridRead":
			return gridReadSumRights.testBit(targetRight);
		case "onOff":
			return onOffSumRights.testBit(targetRight);
		}
		return false;
	}

	public BigInteger getMenusSumRights() {
		return menusSumRights;
	}

	public void setMenusSumRights(BigInteger menusSumRights) {
		this.menusSumRights = menusSumRights;
	}

	public BigInteger getGridAddSumRights() {
		return gridAddSumRights;
	}

	public void setGridAddSumRights(BigInteger gridAddSumRights) {
		this.gridAddSumRights = gridAddSumRights;
	}

	public BigInteger getGridDelSumRights() {
		return gridDelSumRights;
	}

	public void setGridDelSumRights(BigInteger gridDelSumRights) {
		this.gridDelSumRights = gridDelSumRights;
	}

	public BigInteger getGridUpdateSumRights() {
		return gridUpdateSumRights;
	}

	public void setGridUpdateSumRights(BigInteger gridUpdateSumRights) {
		this.gridUpdateSumRights = gridUpdateSumRights;
	}

	public BigInteger getGridReadSumRights() {
		return gridReadSumRights;
	}

	public void setGridReadSumRights(BigInteger gridReadSumRights) {
		this.gridReadSumRights = gridReadSumRights;
	}

	public BigInteger getOnOffSumRights() {
		return onOffSumRights;
	}

	public void setOnOffSumRights(BigInteger onOffSumRights) {
		this.onOffSumRights = onOffSumRights;
	}

	public String getPermissionString() {
		return permissionString;
	}

	public void setPermissionString(String permissionString) {
		this.permissionString = permissionString;
	}

}
