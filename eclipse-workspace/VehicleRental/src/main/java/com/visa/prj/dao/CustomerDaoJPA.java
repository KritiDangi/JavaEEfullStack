package com.visa.prj.dao;

import javax.persistence.EntityManager;

import com.visa.prj.entity.Customer;

public class CustomerDaoJPA implements CustomerDao {

	@Override
	public void addCustomer(Customer c) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	
	public Customer getCustomer(int id) {
		EntityManager em=JPAUtil.getEntityManager();
		Customer c= em.find(Customer.class, id);
		return c;
	}

}
