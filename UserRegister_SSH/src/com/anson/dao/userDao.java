package com.anson.dao;

import com.anson.model.User;

public interface userDao {
	public boolean isExist(User user);
	public void add(User user);
}
