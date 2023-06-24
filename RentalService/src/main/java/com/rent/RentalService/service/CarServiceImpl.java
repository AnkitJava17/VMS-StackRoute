package com.rent.RentalService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rent.RentalService.exception.CarAlreadyExistsException;
import com.rent.RentalService.exception.CarNotFoundException;
import com.rent.RentalService.model.Car;
import com.rent.RentalService.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	

	@Override
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}
	
	@Override
	public Car getCarById(long id) throws CarNotFoundException {
		Optional<Car> car = carRepository.findById(id);
		if (car.isEmpty()){
			throw new CarNotFoundException("Car does not exist");
		}else{
			return car.get();
		}
	}

	@Override
	public Car getCarByName(String carName) throws CarNotFoundException {
		Car car = carRepository.findByName(carName);
		if (car == null){
			throw new CarNotFoundException("Car does not exist");
		}else{
			return car;
		}
	}
	
	@Override
	public Car updateCar(Car upCar, long carId) throws CarNotFoundException{
		Optional<Car> car = carRepository.findById(carId);
		if (car.isEmpty()){
			throw new CarNotFoundException("Car does not exist");
		}else{
			Car modCar = car.get();
			modCar.setAvailable(upCar.isAvailable());
			modCar.setCar_image(upCar.getCar_image());
			return carRepository.save(modCar);
		}
	}

	@Override
	public List<Car> getAvailableCars() {
		return (List<Car>) carRepository.findByAvailableTrue();
	}

	@Override
	public Car saveCar(Car newCar) throws CarAlreadyExistsException {
		Optional<Car> car = carRepository.findById(newCar.getCarId());
		if (car.isPresent()){
			throw new CarAlreadyExistsException("Car does not exist");
		}else{
			return carRepository.save(newCar);
		}
		
	}

	@Override
	public void deleteCar(long id) throws CarNotFoundException {
		Optional<Car> car = carRepository.findById(id);
		if (car.isEmpty()) {
			throw new CarNotFoundException("Not FOund");
		}else {
			carRepository.deleteById(id);
		}
	}

}
