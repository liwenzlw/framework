package com.liwen.go.module.right.mapper;

import com.liwen.go.module.right.bean.Role;

public interface RoleDao {
    Role selectByPrimaryKey(Integer roleId);
}