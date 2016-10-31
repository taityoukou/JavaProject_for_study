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
//		这里应该使用Transcation控制。而且应该用getcurrentsession。不能每次都打开一个新的session
//		这样会导致session超过最大数目，无法访问数据库		
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		System.out.println("user saved!");
	}

	@Override
	public int userDel(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
