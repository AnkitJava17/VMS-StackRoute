package com.share.service;

import com.share.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getAllCars();

    public List<Car> getAvailableCars();

    Optional<Car> getCarById(int carId);

    Car saveCar(Car car);

    void deleteCar(int carId);
}
