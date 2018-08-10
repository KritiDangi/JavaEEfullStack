package com.visa.prj.dao;

import com.visa.prj.entity.User;

public interface UserDao {
	public void register(User user) throws PersistenceException;
	public User login(String email,String pwd) throws FetchException;
	
	
}
