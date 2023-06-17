package com.share.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.share.model.RideShare;
import com.share.repository.RideShareRepository;
import com.share.service.RideShareService;
import com.share.service.RideShareServiceImpl;

public class RideShareServiceTest {

    //Test case for inserting ride details

    @Mock
    private RideShareRepository rideShareRepository;

    @InjectMocks
    private RideShareService rideShareService = new RideShareServiceImpl();

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInsertRideRecord() {
        // Create a sample ride share object
        RideShare rideShare = new RideShare();
        rideShare.setRide_ID(1);
        rideShare.setRide_source("Source Location");
        rideShare.setRide_destination("Destination Location");

        // Mock the behavior of the rideShareRepository.save() method
        when(rideShareRepository.save(rideShare)).thenReturn(rideShare);

        // Call the method to be tested
        RideShare savedRideShare = rideShareService.insertRideRecord(rideShare);

        // Verify that the repository method was called
        verify(rideShareRepository, times(1)).save(rideShare);

        // Assert the result
        assertEquals(rideShare, savedRideShare);
    }
}
