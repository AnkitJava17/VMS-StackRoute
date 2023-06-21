package com.rent.RentalService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.rent.RentalService.model.RentVehicle;
import com.rent.RentalService.repository.RentVehicleRepository;

@Service
public class RentVehicleServiceImpl implements RentVehicleService {

	@Autowired
	private RentVehicleRepository rentVehicleRepo;
	
	@Override
	public List<RentVehicle> getRentalsInformation(){
		return rentVehicleRepo.findAll();	
	}
	
	@Override
	public RentVehicle getRentalById(long id) {
		Optional<RentVehicle> vehicle = rentVehicleRepo.findById(id);
		if (vehicle.isPresent()){
			return vehicle.get();
		}else{
			return null;
		}
	}
	
	@Override
	public RentVehicle saveVehicle(RentVehicle rentVehicle) {
		return rentVehicleRepo.save(rentVehicle);
	}
}
