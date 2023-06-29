package com.trip.exception;

public class TruckNotFoundException extends RuntimeException  {
    public TruckNotFoundException(String s){
        super(s);
    }
}
