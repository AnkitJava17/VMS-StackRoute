package com.rent.RentalService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rent.RentalService.exception.CarAlreadyExistsException;
import com.rent.RentalService.exception.CarNotFoundException;
import com.rent.RentalService.model.Car;

@Service
public interface CarService {
    
    public List<Car> getAvailableCars();

    public Car getCarById(long id) throws CarNotFoundException;

    public Car getCarByName(String carName) throws CarNotFoundException;

    public Car saveCar(Car car) throws CarAlreadyExistsException;
    
    public Car updateCar(Car car, long carId) throws CarNotFoundException;

    public List<Car> getAllCars();
    
    public void deleteCar(long id) throws CarNotFoundException;

}
