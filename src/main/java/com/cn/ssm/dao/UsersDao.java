package com.cn.ssm.dao;


import java.util.List;

import com.cn.ssm.domain.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersDao {
    public Users selectByName(@Param("username")String username);
}