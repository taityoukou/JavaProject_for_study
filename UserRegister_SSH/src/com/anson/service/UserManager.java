package com.anson.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.anson.dao.userDao;
import com.anson.model.User;

public class UserManager implements userDao{

	private  SessionFactory sessionFactory;  
	private  StandardServiceRegistry  serviceRegistry;
	
	@Override
	public boolean isExist(User user) {
		
		return false;
	}

	@Override
	public void add(User user) {
		serviceRegistry = new StandardServiceRegistryBuilder().configure().build(); 
        sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx =session.beginTransaction();
        
        session.save(user);

        tx.commit();
        tx=null;
        StandardServiceRegistryBuilder.destroy(serviceRegistry);
        
	}

}
