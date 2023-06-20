package com.rent.RentalService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rent.RentalService.model.Bike;

@Service
public interface BikeService{
    List<Bike> findAllByAvailable(boolean available);

    public List<Bike> getAvailableBikes();

    public Bike getBikeById(int id);

    public Bike getBikeByName(String bikeName);

    public void saveBike(Bike bike);

    public List<Bike> getAllBike();
}
