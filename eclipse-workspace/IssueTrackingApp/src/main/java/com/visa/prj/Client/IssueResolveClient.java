package com.visa.prj.Client;

import java.util.Date;
import java.util.List;

import com.visa.prj.Dao.DaoException;
import com.visa.prj.Dao.EmployeeDao;
import com.visa.prj.Dao.EmployeeDaoJpa;
import com.visa.prj.Dao.IssueDao;
import com.visa.prj.Dao.IssueDaoJpa;
import com.visa.prj.Entity.Employee;
import com.visa.prj.Entity.Issue;
import com.visa.prj.Util.KeyboardUtil;

public class IssueResolveClient {

	public static void main(String[] args) {
		IssueDao issueDao = new IssueDaoJpa();
		EmployeeDao empdao=new EmployeeDaoJpa();
		try {
			List<Issue> unresolved=issueDao.getUnresolvedIssues();
			unresolved.forEach(System.out::println);
			int issueId=KeyboardUtil.getInt("select issue id:");
			Issue iss=issueDao.getIssue(issueId);
			Employee emp=empdao.getEmployee(2);
			iss.setResolvedBy(emp);
			iss.setResolvedDate(new Date());
			iss.setSolution("you account has been locked for security");
			issueDao.updateIssue(iss);
			List<Issue> allIssues=issueDao.getAllIssues();
			allIssues.forEach(System.out::println);
		} catch (DaoException e) {
			e.printStackTrace();
		}
	}

}