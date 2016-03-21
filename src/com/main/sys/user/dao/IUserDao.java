package com.main.sys.user.dao;

import java.util.List;

import com.main.sys.user.model.UserEntity;

public interface IUserDao {

	/**
	 * 用户新增或者修改
	 * @param user
	 * @param currenUser
	 */
	public void addorUpUser(UserEntity user);
	
	
	/**
	 * 用户的查询
	 * @param user
	 */
	public List<UserEntity> listUser(UserEntity user);
}
