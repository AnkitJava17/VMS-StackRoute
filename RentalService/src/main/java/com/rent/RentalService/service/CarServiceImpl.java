package com.rent.RentalService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rent.RentalService.exception.CarNotFoundException;
import com.rent.RentalService.model.Car;
import com.rent.RentalService.repository.CarRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}
	
	public Car getCarById(Integer id) throws CarNotFoundException {
		Optional<Car> car = carRepository.findById(id);
		if (car.isEmpty()){
			throw new CarNotFoundException("Car does not exist");
		}else{
			return car.get();
		}
	}
	public Car getCarByName(String carName) throws CarNotFoundException {
		Car car = carRepository.findCarByName(carName);
		if (car == null){
			throw new CarNotFoundException("Car does not exist");
		}else{
			return car;
		}
	}
	
	public void saveCar(Car upCar) throws CarNotFoundException{
		Optional<Car> car = carRepository.findById(upCar.getCar_ID());
		if (car.isEmpty()){
			throw new CarNotFoundException("Car does not exist");
		}else{
			carRepository.saveAndFlush(upCar);
		}
	}

	@Override
	public List<Car> findAllByAvailable(boolean available) {
		String query = "SELECT c FROM Car c WHERE c.available = :available";
		return entityManager.createQuery(query, Car.class)
                .setParameter("available", available)
                .getResultList();
	}

	@Override
	public List<Car> getAvailableCars() {
		return findAllByAvailable(true);
	}

	@Override
	public Car getCarById(int id) throws CarNotFoundException {
		
	}
}
