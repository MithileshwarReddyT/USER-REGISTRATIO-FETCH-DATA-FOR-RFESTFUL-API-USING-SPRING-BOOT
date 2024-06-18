package com.example.userregistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userregistration.model.User;
import com.example.userregistration.repository.UserRepository;

@Service
public class UserServiceImpl extends UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) throws Exception {
        // Additional logic for registering a user can be added here
        return userRepository.save(user);
    }

    @Override
    public Optional<User> fetchUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
