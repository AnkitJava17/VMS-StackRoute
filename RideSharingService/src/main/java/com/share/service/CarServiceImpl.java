package com.share.service;


import com.share.model.Car;
import com.share.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getAvailableCars() {
        return (List<Car>) carRepository.findByAvailableTrue();
    }

    @Override
    public Optional<Car> getCarById(int carId) {
        return carRepository.findById(carId);
    }



    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(int carId) {
        carRepository.deleteById(carId);
    }
}
