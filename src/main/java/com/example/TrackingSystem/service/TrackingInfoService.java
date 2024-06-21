package com.example.TrackingSystem.service;

import com.example.TrackingSystem.model.TrackingInfo;

import java.util.List;

public interface TrackingInfoService {
    List<TrackingInfo> findAll();
    TrackingInfo findById(Long id);
    TrackingInfo save(TrackingInfo trackingInfo);
    void delete(Long id);
}
