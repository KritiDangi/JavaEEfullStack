package com.visa.prj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

	@Id
	@Column(name="cust_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custId;
	
	private String email;
	
	@Column(name="full_name")
	private String fullNAme;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String email, String fullNAme) {
		super();
		this.custId = custId;
		this.email = email;
		this.fullNAme = fullNAme;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullNAme() {
		return fullNAme;
	}

	public void setFullNAme(String fullNAme) {
		this.fullNAme = fullNAme;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", email=" + email + ", fullNAme=" + fullNAme + "]";
	}

}
