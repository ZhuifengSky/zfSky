package com.main.sys.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.main.sys.user.bean.UserBean;
import com.main.sys.user.dao.IUserDao;
import com.main.sys.user.model.UserEntity;
import com.main.sys.user.service.IUserService;

@Service
public class UserServcieImpl implements IUserService{

	@Resource
	private IUserDao userDao;
	
		
	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public void saveOrUpUser(UserEntity user) {
		userDao.addorUpUser(user);		
	}

}
