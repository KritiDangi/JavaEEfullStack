package com.visa.prj.Client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.visa.prj.Entity.Customer;
import com.visa.prj.Util.JPAUtil;

public class CustomerClient {

	public static void main(String[] args) {
		addCustomer();
		listCustomers();
	}

	private static void listCustomers() {
		EntityManager em=JPAUtil.getEntityManager();
		TypedQuery<Customer> query=em.createQuery("SELECT c FROM Customer c",Customer.class);
		//"SELECT c FROM Customer c" ->can be written as "FROM Customer" 
		//WE FETCH USING NAME OF THE OBJECT, NOT TABLE
		List<Customer> customers=query.getResultList();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	private static void addCustomer() {
		Customer c=new Customer("smith@visa.com","george","smith");
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}

	
}
