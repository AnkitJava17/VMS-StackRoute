package com.rent.RentalService.service;

import java.util.List;

import com.rent.RentalService.exception.CarNotFoundException;
import com.rent.RentalService.model.Car;

public interface CarService {
    
    List<Car> findAllByAvailable(boolean available);

    public List<Car> getAvailableCars();

    public Car getCarById(int id) throws CarNotFoundException;

    public Car getCarByName(String carName) throws CarNotFoundException;

    public void saveCar(Car car) throws CarNotFoundException;

    public List<Car> getAllCars();

}
