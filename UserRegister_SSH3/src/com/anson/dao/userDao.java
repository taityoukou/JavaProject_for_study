package com.anson.dao;

import java.util.List;

import com.anson.model.User;

public interface userDao {
	public void insert(User user);
	public void delete(User user);
	public void update(User user);
	public List<User> find(User user);
}
