package com.visa.prj.service;

import com.visa.prj.dao.FetchException;
import com.visa.prj.dao.PersistenceException;
import com.visa.prj.dao.UserDao;
import com.visa.prj.entity.User;

public class CustomerService {
	public UserDao userdao;
	
	public void setUserdao(UserDao userdao) {
		this.userdao=userdao;
	}

	public boolean register(User user) {
		try {
			userdao.register(user);
			return true;
		}catch (PersistenceException e) {
			return false;
		}
	}
	
	public User login(String email,String pwd) {
		User user=null;
		try {
			user=userdao.login(email, pwd);
		}catch(FetchException e) {
			e.printStackTrace();
		}
		return user;
	}
}
