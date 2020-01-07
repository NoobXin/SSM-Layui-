package com.cn.ssm.dao;


import com.cn.ssm.domain.IDCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDCardDao {
    public IDCard selectByNum(@Param("id")String id);

    public List selectByTypeOne(@Param("id")String id);

    public List selectByTypeTwo(@Param("id")String id);

    public List<IDCard> selectByPage(@Param("id")String id);

    public List<IDCard> searchListThree(@Param("id")String id);
}