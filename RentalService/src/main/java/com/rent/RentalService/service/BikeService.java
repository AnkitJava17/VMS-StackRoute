package com.rent.RentalService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rent.RentalService.exception.BikeNotFoundException;
import com.rent.RentalService.model.Bike;

@Service
public interface BikeService{
//    List<Bike> findAllByAvailable(boolean available);

    public List<Bike> getAvailableBikes();

    public Bike getBikeById(long id) throws BikeNotFoundException;

    public Bike getBikeByName(String bikeName) throws BikeNotFoundException;

    public Bike saveBike(Bike bike);

    public List<Bike> getAllBike();

    public Bike updateBike(Bike bike, long id) throws BikeNotFoundException;

    public void deleteBike(long id) throws BikeNotFoundException;
}
