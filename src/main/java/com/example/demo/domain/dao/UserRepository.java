package com.example.demo.domain.dao;

import com.example.demo.domain.dto.User;

public interface UserRepository {
    User save(User user);
}
