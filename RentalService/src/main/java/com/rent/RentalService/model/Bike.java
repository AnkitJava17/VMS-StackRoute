package com.rent.RentalService.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long bikeID;

    private String name;

    private String model;

    private String brand;

    private Date year;

    private boolean available;

    private String bike_image;

	public long getBikeID() {
		return bikeID;
	}

	public void setBikeID(int bikeID) {
		this.bikeID = bikeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getBike_image() {
		return bike_image;
	}

	public void setBike_image(String bike_image) {
		this.bike_image = bike_image;
	}

}
