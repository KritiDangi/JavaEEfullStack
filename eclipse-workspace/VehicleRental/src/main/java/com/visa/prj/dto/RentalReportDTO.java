package com.visa.prj.dto;

import java.util.Date;

public class RentalReportDTO {
	private int id;
	private String email;
	private String regNo;
	private String vehicleType;
	private String fuelType;
	private double totalAmount;
	private Date rentalDate;
	public RentalReportDTO(int id, String email, String regNo, String vehicleType, String fuelType, double totalAmount,
			Date rentalDate) {
		super();
		this.id = id;
		this.email = email;
		this.regNo = regNo;
		this.vehicleType = vehicleType;
		this.fuelType = fuelType;
		this.totalAmount = totalAmount;
		this.rentalDate = rentalDate;
	}
	public RentalReportDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}
	
	
}
