package com.visa.prj.service;

import static org.junit.Assert.*; // used to import static members of a class
//no need to pre fix static methods with class name now


//used to import a whole class.
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import com.visa.prj.dao.FetchException;
import com.visa.prj.dao.PersistenceException;
import com.visa.prj.dao.UserDao;
import com.visa.prj.entity.User;

public class CustomerServiceTest {

	/*
	@Mock
	private UserDao userdao;
	*/
	//same thing as above
	private UserDao userdao = Mockito.mock(UserDao.class);
	
	
	private CustomerService customerservice;
	@Before
	public void setUp() throws Exception {
		customerservice = new CustomerService();
		customerservice.setUserdao(userdao);
	}

	@After
	public void tearDown() throws Exception {
		customerservice=null;
	}

	@Test
	public void testRegister() {
		User user=new User("kriti@gmail.com","secret123");
		try {
			doNothing().when(userdao).register(user);
			assertEquals(true, customerservice.register(user));
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		User u = new User("a@gmail", "abc");
		try {
			doThrow(new PersistenceException()).when(userdao).register(u);
			assertEquals(false, customerservice.register(u));
		} catch (PersistenceException e) {
			e.printStackTrace();
		}		
	}

	@Test
	public void testLogin() {
		User user = new User("banu@gmail.com", "secret124");
		try {
			when(userdao.login("banu@gmail.com", "secret124")).thenReturn(user);
			assertEquals(user, customerservice.login("banu@gmail.com", "secret124"));
		} catch (FetchException e) {
			e.printStackTrace();
		}
		
		try {
			when(userdao.login("banu@gmail.com", "ssdf")).thenThrow(new FetchException());
			assertEquals(null, customerservice.login("banu@gmail.com", "ssdf"));
		} catch (FetchException e) {
			e.printStackTrace();
		}
	}
}
