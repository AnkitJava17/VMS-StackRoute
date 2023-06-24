package com.authenticationservice.service;

import com.authenticationservice.exception.UserAlreadyExistsException;
import com.authenticationservice.exception.UserNotFoundException;
import com.authenticationservice.model.User;
import com.authenticationservice.repository.UserAuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService{

    @Autowired
    private UserAuthenticationRepository userAuthenticationRepository;
    @Override
    public User findByUserEmailAndUserPassword(String userEmail, String userPassword) throws UserNotFoundException {
        User user = userAuthenticationRepository.findByUserEmailAndUserPassword(userEmail,userPassword);
        if(user == null)
            throw new UserNotFoundException("User not found");
        else
            return user;
    }

    @Override
    public boolean saveUser(User user) throws UserAlreadyExistsException {
        try {
            Optional<User> usr = userAuthenticationRepository.findById(user.getUserEmail());
            if (!usr.isPresent()) {
                userAuthenticationRepository.save(user);
                return true;
            } else {
                throw new UserAlreadyExistsException("Cannot Register User");
            }

        } catch (Exception e) {

            e.printStackTrace();
            throw new UserAlreadyExistsException("Cannot Register User");
        }
    }
}
