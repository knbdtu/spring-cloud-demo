package com.knbdtu.aws.rds.service.impl;

import com.knbdtu.aws.rds.model.User;
import com.knbdtu.aws.rds.repository.UserRepository;
import com.knbdtu.aws.rds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(String name) {
        userRepository.save(new User(name));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
