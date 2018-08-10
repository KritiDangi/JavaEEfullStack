package com.visa.prj.dao;

public class ProductDaoJdbc implements ProductDao {

	@Override
	public void addProduct() {
		System.out.println("product stored using jdbc");
	}

}
