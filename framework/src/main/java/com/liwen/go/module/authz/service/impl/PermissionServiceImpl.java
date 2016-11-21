package com.liwen.go.module.authz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwen.go.module.authz.bean.Permission;
import com.liwen.go.module.authz.dao.PermissionMapper;
import com.liwen.go.module.authz.service.PermissionService;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public Permission createPermission(Permission permission) {
		return permissionMapper.createPermission(permission);
	}

	@Override
	public void deletePermission(Long permissionId) {
		permissionMapper.deletePermission(permissionId);
	}
}
