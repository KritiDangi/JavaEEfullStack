package com.visa.prj.service;

import com.visa.prj.dao.ProductDao;

public class SampleService {
	private ProductDao productdao;

	public SampleService(ProductDao p) {
		this.productdao=p;
	}
	public void setProductdao(ProductDao productDao) {
		this.productdao = productDao;
	}
	public void insert() {
		productdao.addProduct();
	}
}
