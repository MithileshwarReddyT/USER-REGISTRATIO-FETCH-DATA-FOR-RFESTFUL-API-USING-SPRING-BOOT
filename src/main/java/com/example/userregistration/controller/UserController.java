package com.example.userregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.userregistration.model.User;
import com.example.userregistration.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        try {
            User registeredUser = userService.registerUser(user);
            return ResponseEntity.ok(registeredUser);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("User registration failed: " + e.getMessage());
        }
    }

    @GetMapping("/fetch")
    public ResponseEntity<?> fetchUser(@RequestParam String username) {
        try {
            return userService.fetchUserByUsername(username)
                    .map(ResponseEntity::ok)
                    .orElseThrow();
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to fetch user: " + e.getMessage());
        }
    }
}
