package com.liwen.go.module.right.realm;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.PermissionResolver;

public class BigIntegerPermissionResolver implements PermissionResolver {

	@Override
	public Permission resolvePermission(String permissionString) {
			return new BigIntegerPermission(permissionString);
	}
}
