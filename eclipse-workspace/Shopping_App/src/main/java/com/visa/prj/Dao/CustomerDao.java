package com.visa.prj.Dao;

import com.visa.prj.Entity.Customer;

public interface CustomerDao {

	void addCustomer(Customer c);
	public Customer getCustomer(String id);
}
