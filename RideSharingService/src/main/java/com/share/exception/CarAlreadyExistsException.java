package com.share.exception;

public class CarAlreadyExistsException extends RuntimeException {
	public CarAlreadyExistsException(String s){
        super(s);
    }
}
