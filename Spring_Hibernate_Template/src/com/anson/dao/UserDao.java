package com.anson.dao;

import com.anson.model.User;

public interface UserDao {
	public void userAdd(User user);
	public int userDel(User user);
}
