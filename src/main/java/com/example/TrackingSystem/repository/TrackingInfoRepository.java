package com.example.TrackingSystem.repository;

import com.example.TrackingSystem.model.TrackingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingInfoRepository extends JpaRepository<TrackingInfo, Long> {
}
