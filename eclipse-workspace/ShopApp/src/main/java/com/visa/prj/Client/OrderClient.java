package com.visa.prj.Client;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.visa.prj.Entity.Customer;
import com.visa.prj.Entity.LineItem;
import com.visa.prj.Entity.Order;
import com.visa.prj.Entity.Product;
import com.visa.prj.Util.JPAUtil;

public class OrderClient {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		/*
		em.getTransaction().begin();
		Order order=new Order();
		Customer cust=em.find(Customer.class, "smith@visa.com");
		order.setCustomer(cust);
		Product p1=em.find(Product.class, 1);
		Product p2=em.find(Product.class, 2);
		
		LineItem l1=new LineItem();
		l1.setProduct(p1);
		l1.setQuantity(1);
		p1.setQuantity(p1.getQuantity()-l1.getQuantity());
		l1.setAmount(p1.getPrice()*l1.getQuantity());
		
		LineItem l2=new LineItem();
		l2.setProduct(p2);
		l2.setQuantity(2);
		p2.setQuantity(p2.getQuantity()-l2.getQuantity());
		l2.setAmount(p2.getPrice()*l2.getQuantity());
		
		order.getItems().add(l1);
		order.getItems().add(l2);
		order.setTotal(l1.getAmount()+l2.getAmount());
		
		//em.persist(l1);
		//em.persist(l2);
		em.persist(order);
		*/
		
		String q ="select o.orderDate, o.total, c.firstName, p.name, i.quantity "
				+ " from Order o inner join o.items i inner join i.product p inner join o.customer c";
		Query query = em.createQuery(q);
		List<Object[]> info = query.getResultList();
		for(int i = 0 ; i < info.size(); i++) {
			Object[] elems = info.get(i);
			for (int j = 0; j < elems.length; j++) {
				System.out.print(elems[j] + " ");
			}
			System.out.println();
		}
		em.getTransaction().commit();
		
	}

}