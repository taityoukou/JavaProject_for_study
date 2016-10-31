package com.anson.action;

import com.anson.model.User;
import com.anson.service.UserManager;
import com.anson.service.UserManagerImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	//Struts的Action在被调用的时候，可以通过变量的get/set方法自动获取到JSP页面相同名字的值
	private String username;
	private String password;
	private String password2;
	
	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		UserManager um = new UserManagerImpl();
		
		if (um.isExist(user)) {
			return ERROR;
		}else{
			um.add(user);
			return SUCCESS;
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	

}
