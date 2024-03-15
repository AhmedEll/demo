package com.example.demo.domain.service;

import com.example.demo.domain.conf.ApplicationConfiguration;
import com.example.demo.domain.dao.UserRepository;
import com.example.demo.domain.dto.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ApplicationConfiguration applicationConfiguration;

    public UserServiceImpl(UserRepository userRepository, ApplicationConfiguration applicationConfiguration) {
        this.userRepository = userRepository;
        this.applicationConfiguration = applicationConfiguration;
    }

    @Override
    public User createUser(String username, String email) {
        User user = new User();
        user.setGroup(applicationConfiguration.getGroup());
        user.setUsername(username);
        user.setEmail(email);
        return userRepository.save(user);
    }
}
