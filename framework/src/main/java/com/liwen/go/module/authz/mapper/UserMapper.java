package com.liwen.go.module.authz.mapper;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.liwen.go.module.authz.bean.User;

public interface UserMapper {

	public Long createUser(User user);

	public void updateUser(User user);

	public void deleteUser(Long userId);

	public void correlationRoles(@Param("userId") Long userId, @Param("roleIds") Long... roleIds);

	public void uncorrelationRoles(@Param("userId") Long userId, @Param("roleIds") Long... roleIds);

	public Boolean exists(@Param("userId") Long userId, @Param("roleId") Long roleId);

	User findOne(Long userId);

	User findByUsername(String username);

	Set<String> findRoles(String username);

	Set<String> findPermissions(String username);
}
