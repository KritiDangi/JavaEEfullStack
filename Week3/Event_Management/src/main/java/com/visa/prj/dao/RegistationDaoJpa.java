package com.visa.prj.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.visa.prj.Entity.Registration;

@Repository
public class RegistationDaoJpa implements RegistrationDao {

	
	@PersistenceContext
	EntityManager em;
	
	public RegistationDaoJpa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addRegistration(Registration reg) {
		em.persist(reg);
	}

}
