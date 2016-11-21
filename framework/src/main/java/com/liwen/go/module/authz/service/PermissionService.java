package com.liwen.go.module.authz.service;

import com.liwen.go.module.authz.bean.Permission;

public interface PermissionService {
	public Permission createPermission(Permission permission);
	
	public void deletePermission(Long permissionId);
}