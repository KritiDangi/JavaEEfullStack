package com.visa.prj.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id  //denotes primary key   - composite primary key -> @CompositeId
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //auto generated, auto increment, only for int or long 
	private int id;
	
	@Column(name="product_name",length=100,nullable=false)
	private String name;
	
	private String category;
	
	@Column(name="list_price")
	private double price;
	
	private boolean discontinued;
	
	@Lob
	private byte[] attachments;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isDiscontinued() {
		return discontinued;
	}


	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}


	public byte[] getAttachments() {
		return attachments;
	}


	public void setAttachments(byte[] attachments) {
		this.attachments = attachments;
	}


	public Product() {
	}

}
