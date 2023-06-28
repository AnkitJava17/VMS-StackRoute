package com.trip.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="truck")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	long truck_ID;
	String truck_model;
	String truck_brand;
	Date truck_year;
	// Vehicle vehicle_ID;

	
}
