package com.rent.RentalService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rent.RentalService.model.Car;

public interface CarService {
    List<Car> findAllByAvailable(boolean available);

    public List<Car> getAvailableCars();

}
