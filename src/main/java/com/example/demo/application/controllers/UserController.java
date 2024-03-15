package com.example.demo.application.controllers;

import com.example.demo.application.dto.UserRequest;
import com.example.demo.domain.dto.User;
import com.example.demo.domain.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {
        User user = userService.createUser(userRequest.getUsername(), userRequest.getEmail());
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

}

