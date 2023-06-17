package com.user.service.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s){
        super(s);
    }
}
