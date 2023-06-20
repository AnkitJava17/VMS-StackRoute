package com.rent.RentalService.exception;

public class BikeNotFoundException extends RuntimeException  {
    public BikeNotFoundException(String s){
        super(s);
    }
}
