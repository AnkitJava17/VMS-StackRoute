package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface IUserService {

    User saveUser(User newUser);

    List<User> getAllUsers();

    User getUser(String email);

    User updateUser(User uObj, String email);

    boolean deleteUser(String email);
}
