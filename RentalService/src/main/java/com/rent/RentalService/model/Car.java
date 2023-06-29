package com.rent.RentalService.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;


@Entity
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long carId;
    private String name;
    private String model;
    private String brand;
    private String year;
    private boolean available;
    private String car_image;
    private int capacity;
    private int hourlyCharge;

    public long getCarId() {
        return carId;
    }
    public void setCarId(long carId) {
        this.carId = carId;
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
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String getCar_image() {
        return car_image;
    }
    public void setCar_image(String car_image) {
        this.car_image = car_image;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Car(long carId, String name, String model, String brand, String year, boolean available, String car_image,
            int capacity, int hourlyCharge) {
        this.carId = carId;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.available = available;
        this.car_image = car_image;
        this.capacity = capacity;
        this.hourlyCharge = hourlyCharge;
    }
    
    public int getHourlyCharge() {
        return hourlyCharge;
    }
    public void setHourlyCharge(int hourlyCharge) {
        this.hourlyCharge = hourlyCharge;
    }


}
