package com.example.TrackingSystem.repository;

import com.example.TrackingSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
