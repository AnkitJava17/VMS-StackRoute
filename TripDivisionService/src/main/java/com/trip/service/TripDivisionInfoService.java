package com.trip.service;


import org.springframework.stereotype.Service;

import com.trip.exception.TripDivisionInfoNotFoundException;
import com.trip.model.TripDivisionInfo;


@Service
public interface TripDivisionInfoService {
    

    //    List<Truck> findAllByAvailable(boolean available);

    // public List<Truck> getAvailableTrucks();

    public TripDivisionInfo getTripDivisionInfoById(long division_ID) throws TripDivisionInfoNotFoundException;

    // public TripDivisionInfo getTripDivisionInfoByName(String truckName) throws TripDivisionInfoNotFoundException;

    // public Truck saveTruck(Truck truck);

    // public List<Truck> getAllBike();

    // public Truck updateTruck(Truck truck, long id) throws TruckNotFoundException;

    // public void deleteTruck(long id) throws TruckNotFoundException;


}
