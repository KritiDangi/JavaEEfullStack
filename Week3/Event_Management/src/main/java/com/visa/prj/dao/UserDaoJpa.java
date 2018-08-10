package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.visa.prj.Entity.User;

@Repository
public class UserDaoJpa implements UserDao {

	/*
	 * cant use autowired, since we are getting em from emfactorybean, not a direct em bean
	 */
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addUser(User u) {
		em.persist(u);
	}

	@Override
	public List<User> getUsers() {
		TypedQuery<User> query=em.createQuery("from User",User.class);
		return query.getResultList();
	}

	@Override
	public User getUserById(int id) {
		return em.find(User.class, id);
	}

	@Override
	public User getUserByEmail(String email) {
		TypedQuery<User> q=em.createQuery("SELECT u FROM User u WHERE u.email= :email",User.class);
		q.setParameter("email", email);
		return q.getResultList().get(0);
	}

}