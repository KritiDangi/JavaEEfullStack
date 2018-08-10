package com.visa.prj.Dao;

import java.util.List;

import com.visa.prj.Entity.Employee;

public interface EmployeeDao {
	void addEmployee(Employee e) throws DaoException;
	Employee getEmployee(int id) throws DaoException;
	List<Employee> getAllEmployees() throws DaoException;
	
}
