package com.trip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trip.exception.TruckNotFoundException;
import com.trip.model.Truck;

@Service
public interface TruckService {
    

    //    List<Truck> findAllByAvailable(boolean available);

    public List<Truck> getAvailableTrucks();

    public Truck getTruckById(long truck_ID) throws TruckNotFoundException;

    // public Truck getTruckByName(String truckName) throws TruckNotFoundException;

    public Truck saveTruck(Truck truck);

    public List<Truck> getAllTruck();

    public Truck updateTruck(Truck truck, long truck_ID) throws TruckNotFoundException;

    public void deleteTruck(long truck_ID) throws TruckNotFoundException;


}
