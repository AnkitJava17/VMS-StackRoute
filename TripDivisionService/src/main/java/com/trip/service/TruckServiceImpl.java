package com.trip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trip.exception.TruckAlreadyExistsException;
import com.trip.exception.TruckNotFoundException;
import com.trip.model.Truck;
import com.trip.repository.TruckRepository;

@Service
public class TruckServiceImpl implements TruckService {


    @Autowired
	private TruckRepository truckRepository;
	

	@Override
	public List<Truck> getAllTruck(){
		return truckRepository.findAll();
	}
	
	@Override
	public Truck getTruckById(long truck_ID) throws TruckNotFoundException {
		Optional<Truck> truck = truckRepository.findById(truck_ID);
		if (truck.isEmpty()){
			throw new TruckNotFoundException("Truck does not exist");
		}else{
			return truck.get();
		}
	}

	// @Override
	// public Truck getTruckByName(String truckName) throws TruckNotFoundException {
	// 	Truck truck = truckRepository.findByName(truckName);
	// 	if (truck == null){
	// 		throw new TruckNotFoundException("Truck does not exist");
	// 	}else{
	// 		return truck;
	// 	}
	// }
	
	@Override
	public Truck updateTruck(Truck upTruck, long truck_ID) throws TruckNotFoundException{
		Optional<Truck> truck = truckRepository.findById(truck_ID);
		if (truck.isEmpty()){
			throw new TruckNotFoundException("Truck does not exist");
		}else{
//			modCar.setAvailable(upCar.isAvailable());
//			modCar.setCar_image(upCar.getCar_image());
			return truckRepository.save(upTruck);
		}
	}

	@Override
	public List<Truck> getAvailableTrucks() {
		return (List<Truck>) truckRepository.findByAvailableTrue();
	}

	@Override
	public Truck saveTruck(Truck newTruck) throws TruckAlreadyExistsException {
		Optional<Truck> truck = truckRepository.findById(newTruck.getTruck_ID());
		if (truck.isPresent()){
			throw new TruckAlreadyExistsException("Truck does not exist");
		}else{
			return truckRepository.save(newTruck);
		}
		
	}

	@Override
	public void deleteTruck(long truck_ID) throws TruckNotFoundException {
		Optional<Truck> truck = truckRepository.findById(truck_ID);
		if (truck.isEmpty()) {
			throw new TruckNotFoundException("Not Found");
		}else {
			truckRepository.deleteById(truck_ID);
		}
	}

}
