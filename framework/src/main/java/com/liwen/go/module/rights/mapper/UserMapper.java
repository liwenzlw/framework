package com.liwen.go.module.rights.mapper;

import com.liwen.go.module.rights.bean.User;

public interface UserMapper {
    User selectByPrimaryKey(Integer userId);
}