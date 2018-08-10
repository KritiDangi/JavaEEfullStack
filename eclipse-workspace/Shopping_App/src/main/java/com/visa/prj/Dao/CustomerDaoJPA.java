package com.visa.prj.Dao;

import javax.persistence.EntityManager;

import com.visa.prj.Entity.Customer;
import com.visa.prj.Util.JPAUtil;

public class CustomerDaoJPA implements CustomerDao {

	@Override
	public void addCustomer(Customer c) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	
	public Customer getCustomer(String id) {
		EntityManager em=JPAUtil.getEntityManager();
		Customer c= em.find(Customer.class, id);
		return c;
	}

}