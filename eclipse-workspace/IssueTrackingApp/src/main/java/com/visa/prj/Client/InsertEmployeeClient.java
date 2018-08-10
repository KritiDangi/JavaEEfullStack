package com.visa.prj.Client;

import java.util.List;

import com.visa.prj.Dao.DaoException;
import com.visa.prj.Dao.EmployeeDao;
import com.visa.prj.Dao.EmployeeDaoJpa;
import com.visa.prj.Entity.Employee;

public class InsertEmployeeClient {

	public static void main(String[] args) {
		EmployeeDao empDao=new EmployeeDaoJpa();
		Employee e=new Employee(0,"john","doe");
		try {
			empDao.addEmployee(e);
			List<Employee> employees=empDao.getAllEmployees();
			
			employees.forEach(System.out::println);
			
		} catch (DaoException e2) {
			// TODO: handle exception
		}
		
	}

}