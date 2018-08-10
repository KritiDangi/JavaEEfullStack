package com.visa.prj.Client;

import javax.persistence.EntityManager;

import com.visa.prj.Entity.Order;
import com.visa.prj.Util.JPAUtil;

public class OrderFetchClient {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Order order=em.find(Order.class, 1);
		System.out.println("Order Details");
		System.out.println("Total: "+order.getTotal());
		System.out.println("Date: "+order.getOrderDate());
		System.out.println("Customer: "+order.getCustomer().getFirstname()+" "+order.getCustomer().getLastname());
		
		System.out.println("Items:");
		
		order.getItems().forEach(item->{
			System.out.println(item.getProduct().getName()+" , "+item.getQuantity()+" , "+item.getAmount());
		});
	}

}
