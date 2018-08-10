package com.visa.prj.Dao;

import javax.persistence.EntityManager;

import com.visa.prj.Entity.Order;
import com.visa.prj.Util.JPAUtil;

public class OrderDaoJPA implements OrderDao {

	@Override
	public void addOrder(Order o) {
		EntityManager em=JPAUtil.getEntityManager();
		em.persist(o);
	}

}
