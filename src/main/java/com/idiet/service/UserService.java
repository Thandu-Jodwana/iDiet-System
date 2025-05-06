package com.idiet.service;

import com.idiet.repository.UserRepository;
import com.idiet.domain.User;

public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User register(User user) {
        if (userRepo.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email already registered");
        }
        return userRepo.save(user);
    }

    public User getUserById(String id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }
}
