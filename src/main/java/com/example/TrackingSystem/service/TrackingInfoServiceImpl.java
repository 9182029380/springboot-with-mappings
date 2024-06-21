package com.example.TrackingSystem.service;

import com.example.TrackingSystem.model.TrackingInfo;
import com.example.TrackingSystem.repository.TrackingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingInfoServiceImpl implements TrackingInfoService {

    @Autowired
    private TrackingInfoRepository trackingInfoRepository;

    @Override
    public List<TrackingInfo> findAll() {
        return trackingInfoRepository.findAll();
    }

    @Override
    public TrackingInfo findById(Long id) {
        return trackingInfoRepository.findById(id).orElse(null);
    }

    @Override
    public TrackingInfo save(TrackingInfo trackingInfo) {
        return trackingInfoRepository.save(trackingInfo);
    }

    @Override
    public void delete(Long id) {
        trackingInfoRepository.deleteById(id);
    }
}