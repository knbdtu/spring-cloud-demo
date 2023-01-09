package com.knbdtu.aws.rds.service;

import com.knbdtu.aws.rds.model.User;

import java.util.List;

public interface UserService {

    void addUser(String name);

    List<User> getAllUsers();
}
