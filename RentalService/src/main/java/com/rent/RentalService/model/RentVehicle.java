package com.rent.RentalService.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RentVehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long rentalId;
	// car or bike
	private String type;
	private long vehicleId;
	private Date rentedAt;
	private Date returnedAt;
	private long paymentId;
	public long getRentalId() {
		return rentalId;
	}
	public void setRentalId(long rentalId) {
		this.rentalId = rentalId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Date getRentedAt() {
		return rentedAt;
	}
	public void setRentedAt(Date rentedAt) {
		this.rentedAt = rentedAt;
	}
	public Date getReturnedAt() {
		return returnedAt;
	}
	public void setReturnedAt(Date returnedAt) {
		this.returnedAt = returnedAt;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public RentVehicle(long rentalId, String type, long vehicleId, Date rentedAt, Date returnedAt, long paymentId) {
		this.rentalId = rentalId;
		this.type = type;
		this.vehicleId = vehicleId;
		this.rentedAt = rentedAt;
		this.returnedAt = returnedAt;
		this.paymentId = paymentId;
	}

	
}
