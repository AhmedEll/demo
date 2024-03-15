package com.example.demo.infrastructure;

import com.example.demo.domain.dao.UserRepository;
import com.example.demo.domain.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        // Logique de sauvegarde de l'utilisateur
        return user;
    }
}
