package com.rent.RentalService.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class RentVehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rentalId;
	
	// car or bike
	private int type; 
	
	private int vehicleId;
		
	private Date rentedAt;
	
	private Date returnedAt;
	
	private int paymentId;
}
