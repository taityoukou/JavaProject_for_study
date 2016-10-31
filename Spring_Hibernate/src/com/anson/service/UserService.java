package com.anson.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.anson.dao.UserDao;
import com.anson.model.User;

@Component("userService")
public class UserService {
	
	private UserDao userDao;  
	
	public void init() {
		System.out.println("init");
	}
	
	public void add(User user) {
		userDao.userAdd(user);
	}
	public UserDao getUserDAO() {
		return userDao;
	}
	
	@Resource(name="user")
	public void setUserDAO( UserDao userDAO) {
		this.userDao = userDAO;
	}

	public void destroy() {
		System.out.println("destroy");
	}
}
