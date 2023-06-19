package com.rent.RentalService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public Car getCarById(int id) {
		return carRepository.getById(id);
	}
	
	public void saveCar(Car car) {
		carRepository.save(car);
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
}
