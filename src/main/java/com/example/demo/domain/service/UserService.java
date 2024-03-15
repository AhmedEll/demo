package com.example.demo.domain.service;

import com.example.demo.domain.dto.User;

public interface UserService {
    User createUser(String username, String email);
}
