package com.main.sys.user.dao;

import java.util.List;

import com.main.sys.user.model.UserEntity;

public interface IUserDao {

	/**
	 * �û����������޸�
	 * @param user
	 * @param currenUser
	 */
	public void addorUpUser(UserEntity user);
	
	
	/**
	 * �û��Ĳ�ѯ
	 * @param user
	 */
	public List<UserEntity> listUser(UserEntity user);
}
