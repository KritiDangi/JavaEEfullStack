package com.visa.prj.Client;

import javax.persistence.EntityManager;

import com.visa.prj.Entity.Actor2;
import com.visa.prj.Entity.Movie2;
import com.visa.prj.Util.JPAUtil;

public class MovieClient2 {

	public static void main(String[] args) {
		Movie2 m1=new Movie2();
		m1.setName("Mr and Mrs Smith");
		
		Movie2 m2=new Movie2();
		m2.setName("Ocean's Eleven");
		
		Actor2 a1=new Actor2();
		a1.setName("Brad Pitt");
		
		Actor2 a2=new Actor2();
		a2.setName("Angelina Jolie");
		
		Actor2 a3=new Actor2();
		a3.setName("George Clooney");
		
		m1.getActors().add(a1);
		m1.getActors().add(a2);
		m2.getActors().add(a1);
		m2.getActors().add(a3);
		
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(m1);
		em.persist(m2);
		em.getTransaction().commit();
	}

}
