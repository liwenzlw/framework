package com.liwen.go.module.rights.mapper;

import com.liwen.go.module.rights.bean.Role;

public interface RoleMapper {
    Role selectByPrimaryKey(Integer roleId);
}