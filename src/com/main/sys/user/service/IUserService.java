package com.main.sys.user.service;

import com.main.sys.user.model.UserEntity;

public interface IUserService {

	/**
	 * �û����������޸�
	 * @param user
	 */
	public void saveOrUpUser(UserEntity user);
}
