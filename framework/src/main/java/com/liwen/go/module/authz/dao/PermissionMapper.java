package com.liwen.go.module.authz.dao;

import com.liwen.go.module.authz.bean.Permission;

public interface PermissionMapper {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}