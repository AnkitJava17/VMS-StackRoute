package com.admin.model;

import java.util.Date;

public class RentCar {
    private long carId;

    private String name;

    private String model;

    private String brand;

    private Date year;

    private boolean available;

    private String car_image;

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

    private int capacity;
}
