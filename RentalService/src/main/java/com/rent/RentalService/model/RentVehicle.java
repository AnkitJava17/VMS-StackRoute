package com.rent.RentalService.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
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
}
