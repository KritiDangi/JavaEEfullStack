package com.visa.prj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicles")
public class Vehicle {

	@Id
	@Column(name="reg_no")
	private String regNo;
	
	private String type;
	
	@Column(name="fuel_type")
	private String fuelType;
	
	@Column(name="cost_per_km")
	private double costPerKm;
	

	public Vehicle() {
	}


	public Vehicle(String regNo, String type, String fuelType, double costPerKm) {
		super();
		this.regNo = regNo;
		this.type = type;
		this.fuelType = fuelType;
		this.costPerKm = costPerKm;
	}


	public String getRegNo() {
		return regNo;
	}


	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public double getCostPerKm() {
		return costPerKm;
	}


	public void setCostPerKm(double costPerKm) {
		this.costPerKm = costPerKm;
	}


	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", type=" + type + ", fuelType=" + fuelType + ", costPerKm=" + costPerKm
				+ "]";
	}

	
}
