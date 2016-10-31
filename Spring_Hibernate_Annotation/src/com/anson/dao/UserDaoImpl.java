package com.anson.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.anson.model.User;

@Component("user")
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void userAdd(User user) {
		Session s = sessionFactory.getCurrentSession();
		s.save(user);
		System.out.println("user saved!");
	}

	@Override
	public int userDel(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
