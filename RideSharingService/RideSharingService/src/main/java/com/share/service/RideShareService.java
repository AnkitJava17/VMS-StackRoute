package com.share.service;

import com.share.model.Cars;
import com.share.model.RideShare;

import java.util.List;

public interface RideShareService {
    RideShare insertRideRecord(RideShare rideShare);
    public List<RideShare> getBookingDetails();
}
