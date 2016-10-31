package com.anson.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.anson.model.User;

@Component("user")
public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;

	
	/*	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	public HibernateTemplate getTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setTemplate(HibernateTemplate template) {
		this.hibernateTemplate = template;
	}

	@Override
	public void userAdd(User user) {
/*		Session s = sessionFactory.getCurrentSession();
		s.save(user);*/
		hibernateTemplate.save(user);
		System.out.println("user saved!");
	}

	@Override
	public int userDel(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
