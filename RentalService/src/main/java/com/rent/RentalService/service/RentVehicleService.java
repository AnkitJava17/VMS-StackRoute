package com.rent.RentalService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rent.RentalService.model.RentVehicle;

@Service
public interface RentVehicleService {

    public List<RentVehicle> getRentalsInformation();
	public RentVehicle getRentalById(long id);
    public RentVehicle saveVehicle(RentVehicle rentVehicle); 


}
