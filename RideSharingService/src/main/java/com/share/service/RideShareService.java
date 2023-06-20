package com.share.service;

import com.share.model.RideShare;

import java.util.List;
import java.util.Optional;

public interface RideShareService {
    RideShare insertRideRecord(RideShare rideShare);
    public List<RideShare> getBookingDetails();


    Optional<RideShare> findById(int rideId);
}
