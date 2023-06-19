package com.rent.RentalService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rent.RentalService.model.RentVehicle;
import com.rent.RentalService.repository.RentVehicleRepository;

@Service
public class RentVehicleServiceImpl implements RentVehicleService {

	@Autowired
	private RentVehicleRepository rentVehicleRepo;
	
	public List<RentVehicle> getRentalsInformation(){
		return rentVehicleRepo.findAll();	
	}
	
	public RentVehicle getRentalById(int id) {
		return rentVehicleRepo.getOne(id);
	}
	
	public RentVehicle saveVehicle(RentVehicle rentVehicle) {
		return rentVehicleRepo.save(rentVehicle);
	}
}
