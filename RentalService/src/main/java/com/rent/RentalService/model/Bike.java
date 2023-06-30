package com.rent.RentalService.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
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

    private int hourlyCharge;

    public long getBikeID() {
        return bikeID;
    }

    public void setBikeID(long bikeID) {
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

    public int getHourlyCharge() {
        return hourlyCharge;
    }

    public void setHourlyCharge(int hourlyCharge) {
        this.hourlyCharge = hourlyCharge;
    }

    public Bike(long bikeID, String name, String model, String brand, Date year, boolean available, String bike_image,
            int hourlyCharge) {
        this.bikeID = bikeID;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.available = available;
        this.bike_image = bike_image;
        this.hourlyCharge = hourlyCharge;
    }

    
}
