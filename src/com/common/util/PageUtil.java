package com.common.util;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


/*
 * ��ҳ������
 */
@Repository
public class PageUtil {
	@Resource
	private SessionFactory sessionFactory;
	
	public int getCount(String entityName){
		Session session = sessionFactory.openSession();
		String hql = "select count(*) from "+entityName+"";
		Query query = session.createQuery(hql);
		session.close();
		return query.getFirstResult();
	}
}
