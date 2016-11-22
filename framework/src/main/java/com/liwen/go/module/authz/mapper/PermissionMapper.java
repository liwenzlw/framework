package com.liwen.go.module.authz.mapper;

import com.liwen.go.module.authz.bean.Permission;

public interface PermissionMapper {

	public Long createPermission(Permission permission);

	public void deletePermission(Long permissionId);

}