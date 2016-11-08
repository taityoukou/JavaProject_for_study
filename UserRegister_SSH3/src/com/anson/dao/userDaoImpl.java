package com.anson.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anson.model.User;
import com.anson.util.HibernateUtil;

public class userDaoImpl implements userDao {

	@Override
	public void insert(User user) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx =session.beginTransaction();
        
        session.save(user);

        tx.commit();
        tx=null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> find(User user) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx =session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<User> userlist = session.createQuery(
			    "select user from User user where user.username = :username" )
				.setParameter( "username", user.getUsername() ).getResultList();

        tx.commit();
		tx=null;
		return userlist;
	}

}
