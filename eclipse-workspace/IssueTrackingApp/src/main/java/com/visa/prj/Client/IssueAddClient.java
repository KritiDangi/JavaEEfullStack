package com.visa.prj.Client;

import java.util.List;

import javax.persistence.EntityManager;

import com.visa.prj.Dao.DaoException;
import com.visa.prj.Dao.IssueDao;
import com.visa.prj.Dao.IssueDaoJpa;
import com.visa.prj.Entity.Employee;
import com.visa.prj.Entity.Issue;
import com.visa.prj.Util.JpaUtil;

public class IssueAddClient {

	public static void main(String[] args) {
		EntityManager em=JpaUtil.getEntityManager();
		IssueDao issueDao=new IssueDaoJpa();
		
		Issue iss=new Issue();
		iss.setDescription("not able to login");
		Employee e=em.find(Employee.class, 1);
		iss.setRaisedBy(e);
		
		try {
			//issueDao.addIssue(iss);
			List<Issue> issues=issueDao.getAllIssues();
			issues.forEach(System.out::println);
		} catch (DaoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}