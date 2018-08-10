package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Vehicle;


public class VehicleDaoJPA implements VehicleDao {

	@Override
	public void addVehicle(Vehicle v) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
	}

	@Override
	public List<String> getRegNos() {
		EntityManager em=JPAUtil.getEntityManager();
		TypedQuery<String> query=em.createQuery("SELECT e.regNo FROM Vehicle e",String.class); //fetches rows from Persistence Context
		return query.getResultList();
	}
	
	public Vehicle getVehicle(String id) {
		EntityManager em=JPAUtil.getEntityManager();
		Vehicle c= em.find(Vehicle.class, id);
		return c;
	}

}
