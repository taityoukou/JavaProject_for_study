package com.anson.service;

import com.anson.dao.userDao;
import com.anson.dao.userDaoImpl;
import com.anson.model.User;

public class UserManagerImpl implements UserManager {

	@Override
	public boolean isExist(User user) {
		userDao userdao = new userDaoImpl();
		if (userdao.find(user).isEmpty()){
        	return false;
		}else{
			return true;
		}
	}

	@Override
	public void add(User user) {
		userDao userdao = new userDaoImpl();
		userdao.insert(user);
	}

}
