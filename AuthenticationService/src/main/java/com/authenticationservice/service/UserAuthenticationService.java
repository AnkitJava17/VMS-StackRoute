package com.authenticationservice.service;

import com.authenticationservice.exception.UserAlreadyExistsException;
import com.authenticationservice.exception.UserNotFoundException;
import com.authenticationservice.model.User;

public interface UserAuthenticationService {

    public User findByUserEmailAndUserPassword(String userEmail, String userPassword) throws UserNotFoundException;

    boolean saveUser(User user) throws UserAlreadyExistsException;

}
