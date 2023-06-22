package com.admin.service;

import com.admin.model.Car;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    List<Car> getAllCars();

    Optional<Car> getCarById(int carId);

    Car saveCar(Car car);

    void deleteCar(int carId);
}
