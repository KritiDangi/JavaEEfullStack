package com.visa.prj.dao;

public class ProductDaoJpa implements ProductDao {

	@Override
	public void addProduct() {
		System.out.println("product stored using jpa");
	}

}
