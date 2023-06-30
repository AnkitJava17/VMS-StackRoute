package com.user.service.services;

import com.user.service.entities.User;
import com.user.service.entities.UserRole;
import com.user.service.exceptions.UserAlreadyPresentException;
import com.user.service.exceptions.UserNotFoundException;
import com.user.service.repositories.IUserRepository;
import com.user.service.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class IUserServiceImpl implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;



    @Override
    public User saveUser(User newUser, Set<UserRole> userRoleSet) {
        Optional<User> optional = this.userRepository.findByUserName(newUser.getUserName());
        User adduobj = null;

        if(optional.isPresent())
        {
            throw new UserAlreadyPresentException("User already exists!");
        }
        else
        {

            for(UserRole ur: userRoleSet){
                roleRepository.save(ur.getRole());
            }

            newUser.getUserRoles().addAll(userRoleSet);
            adduobj = this.userRepository.save(newUser);
        }
        return adduobj;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUser(String userName) {
        Optional<User> userOptional = userRepository.findByUserName(userName);

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
