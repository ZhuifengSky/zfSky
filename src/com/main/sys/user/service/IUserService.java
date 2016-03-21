package com.main.sys.user.service;

import com.main.sys.user.model.UserEntity;

public interface IUserService {

	/**
	 * 用户的新增和修改
	 * @param user
	 */
	public void saveOrUpUser(UserEntity user);
}
