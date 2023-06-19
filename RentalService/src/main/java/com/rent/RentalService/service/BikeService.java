package com.rent.RentalService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rent.RentalService.model.Bike;


public interface BikeService{
    List<Bike> findAllByAvailable(boolean available);

    public List<Bike> getAvailableBikes();


}
