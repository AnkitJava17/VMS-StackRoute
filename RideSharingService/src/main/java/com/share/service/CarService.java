package com.share.service;

import com.share.model.Cars;
import com.share.model.RideShare;
import com.share.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService  {
    List<Cars> findAllByAvailable(boolean available);

    public List<Cars> getAvailableCars();



}
