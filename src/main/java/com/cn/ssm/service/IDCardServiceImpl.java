package com.cn.ssm.service;

import com.cn.ssm.dao.IDCardDao;
import com.cn.ssm.domain.IDCard;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("IDCardService")
public class IDCardServiceImpl implements IDCardService{
	@Resource
	private IDCardDao idCardDao;

	@Override
	public IDCard selectByNum(String id) {
		return idCardDao.selectByNum(id);
	}

	@Override
	public List selectByTypeOne(String id) {
		return idCardDao.selectByTypeOne(id);
	}

	@Override
	public List selectByTypeTwo(String id) {
		return  idCardDao.selectByTypeTwo(id);
	}

	@Override
	public List<IDCard> selectByPage(String id) {
		return idCardDao.selectByPage(id);
	}

	@Override
	public List<IDCard> searchListThree(String id) {
		return idCardDao.searchListThree(id);
	}
}
