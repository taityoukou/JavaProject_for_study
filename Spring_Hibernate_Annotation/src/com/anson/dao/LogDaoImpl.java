package com.anson.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.anson.model.Log;
import com.anson.model.User;

@Component("log")
public class LogDaoImpl implements LogDao {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void logAdd(User user) {
		Session s = sessionFactory.getCurrentSession();
		
		Log log = new Log();
//		log.setId(user.getId());
		log.setDate(new Date());
		log.setAction(user.getName()+":  user add");
		
		s.save(log);
		
		System.out.println("log saved!");
	}

	@Override
	public int logDel(Log log) {
		// TODO Auto-generated method stub
		return 0;
	}

}
