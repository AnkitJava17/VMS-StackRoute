package com.user.service.services;

import com.user.service.entities.User;
import com.user.service.entities.UserRole;

import java.util.List;
import java.util.Set;

public interface IUserService {

    User saveUser(User newUser, Set<UserRole> userRoleSet) throws Exception;

    List<User> getAllUsers();

//    User getUser(String email);

    User getUser(String userName);

    User updateUser(User uObj, String email);

    boolean deleteUser(String email);
}
