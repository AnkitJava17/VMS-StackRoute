package com.admin.model;

import java.util.Date;

public class RentBike {
    private long bikeID;

    private String name;

    private String model;

    private String brand;

    private Date year;

    private boolean available;

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

    private String bike_image;
}
