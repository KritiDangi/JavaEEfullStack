package com.visa.prj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.visa.prj.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	
	/*
	 * Tells the spring to look for an instance of employeedao
	 * if it is available, initialize these.
	 * results in bytecode instrumentation - tools that generate extra code for u.
	 * Java-assist/cglib
	 * Internally, spring uses java-assist
	 */
	@Autowired
	@Qualifier("employeeDaoJdbc")  //when there are more than 1 implementations
	private EmployeeDao employeeDao;
	
	public void doTask() {
		employeeDao.addEmployee();
	}
}