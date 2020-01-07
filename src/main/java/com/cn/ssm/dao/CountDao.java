package com.cn.ssm.dao;


import com.cn.ssm.domain.Count;
import com.cn.ssm.domain.IDCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountDao {

    public Count selectNumByID(@Param("entity")Count count);

    public void add(@Param("entity")Count count);
}