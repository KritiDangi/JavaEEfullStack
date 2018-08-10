package com.visa.prj.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.visa.prj.Entity.Employee;
import com.visa.prj.Entity.Issue;
import com.visa.prj.Util.JpaUtil;

public class IssueDaoJpa implements IssueDao {

	@Override
	public void addIssue(Issue i) throws DaoException {
		EntityManager em=JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(i);
		em.getTransaction().commit();
	}

	@Override
	public Issue getIssue(int id) throws DaoException {
		EntityManager em=JpaUtil.getEntityManager();
		return em.find(Issue.class, id);		
	}

	@Override
	public List<Issue> getAllIssues() throws DaoException {
		EntityManager em=JpaUtil.getEntityManager();
		TypedQuery<Issue> query=em.createQuery("SELECT e FROM Issue e",Issue.class);
		return query.getResultList();
	}

	@Override
	public List<Issue> getUnresolvedIssues() throws DaoException {
		EntityManager em=JpaUtil.getEntityManager();
		TypedQuery<Issue> query=em.createQuery("SELECT e FROM Issue e WHERE e.resolvedBy=NULL",Issue.class);
		return query.getResultList();
	}

	@Override
	public boolean updateIssue(Issue i) throws DaoException {
		EntityManager em=JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(i);  //update without dirty check!
		em.getTransaction().commit();
		return true;
	}

}
