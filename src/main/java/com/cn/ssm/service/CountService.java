package com.cn.ssm.service;
import com.cn.ssm.domain.Count;
import com.cn.ssm.domain.Users;


public interface CountService {
    public Count selectNumByID(Count count);

    public void add(Count count);
}
