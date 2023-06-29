package com.trip.service;


import org.springframework.stereotype.Service;

import com.trip.exception.TripInfoNotFoundException;
import com.trip.model.TripInfo;

@Service
public interface TripInfoService {
    

    //    List<Truck> findAllByAvailable(boolean available);

    // public List<Truck> getAvailableTrucks();

    public TripInfo getTripInfoById(long trip_ID) throws TripInfoNotFoundException;

    public TripInfo getTripInfoByName(String trip_name) throws TripInfoNotFoundException;

    // public Truck saveTruck(Truck truck);

    // public List<Truck> getAllBike();

    // public Truck updateTruck(Truck truck, long id) throws TruckNotFoundException;

    // public void deleteTruck(long id) throws TruckNotFoundException;


}
