package com.example.TrackingSystem.service;

import com.example.TrackingSystem.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void delete(Long id);
}
