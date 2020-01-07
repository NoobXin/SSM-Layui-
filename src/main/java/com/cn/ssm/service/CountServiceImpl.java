package com.cn.ssm.service;

import com.cn.ssm.dao.CountDao;
import com.cn.ssm.dao.IDCardDao;
import com.cn.ssm.domain.Count;
import com.cn.ssm.domain.IDCard;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("CountService")
public class CountServiceImpl implements CountService{
	@Resource
	private CountDao countDao;


	@Override
	public Count selectNumByID(Count count) {
		return countDao.selectNumByID(count);
	}

	@Override
	public void add(Count count) {
		countDao.add(count);
	}
}
