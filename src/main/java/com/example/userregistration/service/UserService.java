package com.example.userregistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userregistration.model.User;
import com.example.userregistration.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) throws Exception {
        return userRepository.save(user);
    }

    public Optional<User> fetchUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
