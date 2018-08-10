package com.visa.prj.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="rentals")
public class Rental {

	@Id
	@Column(name="rental_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rentalId;
	
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;
	
	@Column(name="rental_amount")
	private double rentalAmount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date rentalDate;
	
	public Rental() {
		// TODO Auto-generated constructor stub
	}

	public Rental(int rentalId, Customer customer, Vehicle vehicle, double rentalAmount, Date rentalDate) {
		super();
		this.rentalId = rentalId;
		this.customer = customer;
		this.vehicle = vehicle;
		this.rentalAmount = rentalAmount;
		this.rentalDate = rentalDate;
	}

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public double getRentalAmount() {
		return rentalAmount;
	}

	public void setRentalAmount(double rentalAmount) {
		this.rentalAmount = rentalAmount;
	}

	public Date getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	
}