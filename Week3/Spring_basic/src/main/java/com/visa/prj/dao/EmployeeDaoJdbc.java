package com.visa.prj.dao;

import org.springframework.stereotype.Repository;


/*
 * creates a bean(object in spring container) of class EmployeeDao
 */
@Repository
public class EmployeeDaoJdbc implements EmployeeDao {

	@Override
	public void addEmployee() {
		System.out.println("employee JDBC");
	}

}
