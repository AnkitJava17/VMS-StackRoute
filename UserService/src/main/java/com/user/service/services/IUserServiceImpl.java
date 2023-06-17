package com.user.service.services;

import com.user.service.entities.User;
import com.user.service.exceptions.UserAlreadyPresentException;
import com.user.service.exceptions.UserNotFoundException;
import com.user.service.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IUserServiceImpl implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @Override
    public User saveUser(User newUser) {
        Optional<User> optional = this.userRepository.findById(newUser.getUserEmail());
        User adduobj = null;

        if(optional.isPresent())
        {
            throw new UserAlreadyPresentException("User already exists!");
        }
        else
        {
            adduobj = this.userRepository.save(newUser);
        }
        return adduobj;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUser(String email) {
        Optional<User> userOptional = userRepository.findByUserEmail(email);

        User uObj = null;
        if(userOptional.isPresent())
        {
            uObj = userOptional.get();
        }
        else
        {
            throw new UserNotFoundException("User does not exists.");
        }

        return uObj;
    }

    @Override
    public User updateUser(User uObj, String email) {
        return null;
    }

    @Override
    public boolean deleteUser(String email) {
        return false;
    }
}
