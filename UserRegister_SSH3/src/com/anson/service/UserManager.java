package com.anson.service;

import com.anson.model.User;

public interface UserManager {

	public boolean isExist(User user);

	public void add(User user);

}
