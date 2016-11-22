package com.liwen.go.module.authz.mapper;

import org.apache.ibatis.annotations.Param;

import com.liwen.go.module.authz.bean.Role;

public interface RoleMapper {
	public Long createRole(Role role);

	public void deleteRole(Long roleId);

	public void correlationPermissions(@Param("roleId") Long roleId, @Param("permissionIds") Long... permissionIds);

	public void uncorrelationPermissions(@Param("roleId") Long roleId, @Param("permissionIds") Long... permissionIds);

	public Boolean exists(@Param("roleId")Long roleId, @Param("permissionId")Long permissionId);
}