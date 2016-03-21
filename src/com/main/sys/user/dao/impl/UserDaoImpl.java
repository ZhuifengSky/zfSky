package com.main.sys.user.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.main.sys.user.dao.IUserDao;
import com.main.sys.user.model.UserEntity;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements IUserDao{

	private HibernateTemplate hibernateTemplate;
	
	@Resource  
    public void setMyHibernateTemplate(HibernateTemplate hibernateTemplate){  
        super.setHibernateTemplate(hibernateTemplate);
    }  


	@Override
	public void addorUpUser(UserEntity user){
		hibernateTemplate.saveOrUpdate(user);		
	}


	@Override
	public List<UserEntity> listUser(UserEntity user) {
		String hql =" from User as user where 1=1"; 
		List<UserEntity> s = (List<UserEntity>) hibernateTemplate.find(hql, UserEntity.class);
		return s;
	}

	
}
