package com.anson.dao;

import com.anson.model.Log;
import com.anson.model.User;

public interface LogDao {
	public void logAdd(User user);
	public int logDel(Log log);
}
