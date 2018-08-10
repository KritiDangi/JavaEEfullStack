package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.Entity.User;

public interface UserDao {

	void addUser(User u);
	List<User> getUsers();
	User getUserById(int id);
	User getUserByEmail(String email);
}
