package com.share.service;

import com.share.model.RideShare;
import com.share.repository.RideShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RideShareServiceImpl implements RideShareService {
    @Autowired
    RideShareRepository rideShareRepository;

    public RideShare insertRideRecord(RideShare rideShare) {
        return rideShareRepository.save(rideShare);
    }

    @Override
    public List<RideShare> getBookingDetails() {
        return rideShareRepository.findAll();
    }

    @Override
    public Optional<RideShare> findById(int rideId) {
        Optional<RideShare> rideShare=rideShareRepository.findById(rideId);
        return rideShare;
    }

}
