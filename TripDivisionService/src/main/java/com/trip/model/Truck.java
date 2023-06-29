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
	public long getTruck_ID() {
		return truck_ID;
	}
	public void setTruck_ID(long truck_ID) {
		this.truck_ID = truck_ID;
	}
	public String getTruck_model() {
		return truck_model;
	}
	public void setTruck_model(String truck_model) {
		this.truck_model = truck_model;
	}
	public String getTruck_brand() {
		return truck_brand;
	}
	public void setTruck_brand(String truck_brand) {
		this.truck_brand = truck_brand;
	}
	public Date getTruck_year() {
		return truck_year;
	}
	public void setTruck_year(Date truck_year) {
		this.truck_year = truck_year;
	}
	@Override
	public String toString() {
		return "Truck [truck_ID=" + truck_ID + ", truck_model=" + truck_model + ", truck_brand=" + truck_brand
				+ ", truck_year=" + truck_year + "]";
	}

	
}
