package com.share.service;

import com.share.model.Cars;
import com.share.model.RideShare;
import com.share.repository.RideShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideShareServiceImpl implements RideShareService{
    @Autowired
    RideShareRepository rideShareRepository;
    public RideShare insertRideRecord(RideShare rideShare) {
        return rideShareRepository.save(rideShare);
    }

    @Override
    public List<RideShare> getBookingDetails() {
        return rideShareRepository.findAll();
    }
}
