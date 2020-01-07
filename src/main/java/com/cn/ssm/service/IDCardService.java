package com.cn.ssm.service;
import com.cn.ssm.domain.IDCard;

import java.util.List;


public interface IDCardService {
    public IDCard selectByNum(String id);

    public List selectByTypeOne(String id);

    public List selectByTypeTwo(String id);

    public List<IDCard> selectByPage(String id);

    public List<IDCard> searchListThree(String id);
}
