package com.cn.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cn.ssm.dao.UsersDao;
import com.cn.ssm.domain.Users;
@Component("userService")
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersDao usersDao;

	@Override
	public Users selectByName(String username) {
		return usersDao.selectByName(username);
	}
}
