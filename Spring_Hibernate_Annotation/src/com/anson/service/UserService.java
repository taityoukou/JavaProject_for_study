package com.anson.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.anson.dao.LogDao;
import com.anson.dao.UserDao;
import com.anson.model.User;

//@Component("userService")
public class UserService {
	
	private UserDao userDao;  
	private LogDao logDao;

	public void init() {
		System.out.println("init");
	}
	
	@Transactional
	public void add(User user) {
		userDao.userAdd(user);
		logDao.logAdd(user);
	}
	
	public UserDao getUserDAO() {
		return userDao;
	}
	
	@Resource(name="user")
	public void setUserDAO( UserDao userDAO) {
		this.userDao = userDAO;
	}
	
	public LogDao getLogDao() {
		return logDao;
	}

	@Resource(name="log")
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	public void destroy() {
		System.out.println("destroy");
	}
}
