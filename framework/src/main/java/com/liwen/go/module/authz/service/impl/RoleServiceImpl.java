package com.liwen.go.module.authz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liwen.go.module.authz.bean.Role;
import com.liwen.go.module.authz.mapper.RoleMapper;
import com.liwen.go.module.authz.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public Role createRole(Role role) {
		roleMapper.createRole(role);
		return role;
	}

	@Override
	public void deleteRole(Long roleId) {
		roleMapper.deleteRole(roleId);
	}

	@Override
	public void correlationPermissions(Long roleId, Long... permissionIds) {
		roleMapper.correlationPermissions(roleId, permissionIds);
	}

	@Override
	public void uncorrelationPermissions(Long roleId, Long... permissionIds) {
		roleMapper.uncorrelationPermissions(roleId, permissionIds);
	}
}
