package com.visa.prj.Client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.visa.prj.Entity.Product;
import com.visa.prj.Util.JPAUtil;

public class ProductClient {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		/*
		String q="select p from Product p where p.category = :cat and p.price > :amt";
		//String q="select p from Product p where p.category = ?1 and p.price > ?2";
		TypedQuery<Product> query=em.createQuery(q,Product.class);
		query.setParameter("cat", "Beverages");
		query.setParameter("amt", 10.00);
		//query.setParameter(1, "Beverages");
		//query.setParameter(2, "10.00");
		List<Product> products=query.getResultList();
		*/
		
		/*
		String q="select p from Product p";
		TypedQuery<Product> query=em.createQuery(q,Product.class);
		query.setMaxResults(3);  //how many results
		query.setFirstResult(10);  //starting after which record
		List<Product> products=query.getResultList();
		*/
		
		//JPQL QUERY
		//String q="select p.category, count(p) from Product p group by p.category having count(p)>=2";
		//Query query=em.createQuery(q);
		
		//SQL NATIVE QUERY
		String sqlQuery="select p.category, count(*) from products p group by p.category having count(*)>=2";
		Query query=em.createNativeQuery(sqlQuery);
		List<Object[]> data=query.getResultList();
		
		for (int i = 0; i < data.size(); i++) {
			Object[] elems=data.get(i);
			System.out.println(elems[0]+" : "+elems[1]);
		}
	}

}
