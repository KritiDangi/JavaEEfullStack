package com.visa.prj.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.visa.prj.Entity.Product;
import com.visa.prj.Util.JPAUtil;

public class ProductDaoJpa implements ProductDao {

	public ProductDaoJpa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	// to retrieve records, NOT based on primary key
	public List<Product> getProducts() throws DaoException {
		EntityManager em=JPAUtil.getEntityManager();
		/*
		 * JPQL -> Java Persistence Query Language
		 * JPQL uses class names and attributes of class, not table names and columns
		 * JPQL is case sensitive , SQL is not. 
		 */
		TypedQuery<Product> query=em.createQuery("SELECT p FROM Product p",Product.class); //fetches rows from Persistence Context
		// for every row , create a Product object
		return query.getResultList();
	}

	@Override
	public void addProduct(Product p) throws DaoException {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(p);  //triggers an insert statement
		em.getTransaction().commit();  //Synchronizes Persistence context with db.
	}

	@Override
	public Product getProduct(int id) throws DaoException {
		EntityManager em=JPAUtil.getEntityManager();
		return em.find(Product.class, id); // id refers to id attribute in Product (find always works in Primary Keys) 
	}

	@Override
	public void deleteProduct(int id) throws DaoException {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Product p=em.find(Product.class, id);
		em.remove(p);
		em.getTransaction().commit();
	}

	@Override
	public void updateProduct(Product p) throws DaoException {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(p);  //update without dirty check!
		em.getTransaction().commit();
	}

	@Override
	public List<Product> getProductsByPrice(double price) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePrice() {  //DIRTY CHECKING
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		TypedQuery<Product> query=em.createQuery("SELECT p FROM Product p",Product.class);
		List<Product> products= query.getResultList();
		for (Product product : products) {
			if(product.getPrice()>10000) {
				product.setPrice(product.getPrice()-5000);
			}
		}
		em.getTransaction().commit();
	}
	
}
