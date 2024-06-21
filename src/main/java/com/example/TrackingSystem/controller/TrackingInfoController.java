package com.example.TrackingSystem.controller;

import com.example.TrackingSystem.model.TrackingInfo;
import com.example.TrackingSystem.service.TrackingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tracking-info")
public class TrackingInfoController {

    @Autowired
    private TrackingInfoService trackingInfoService;

    @GetMapping
    public List<TrackingInfo> getAllTrackingInfo() {
        return trackingInfoService.findAll();
    }

    @GetMapping("/{id}")
    public TrackingInfo getTrackingInfoById(@PathVariable Long id) {
        return trackingInfoService.findById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public TrackingInfo createTrackingInfo(@RequestBody TrackingInfo trackingInfo) {
        return trackingInfoService.save(trackingInfo);
    }

    @PutMapping("/{id}")
    public TrackingInfo updateTrackingInfo(@PathVariable Long id, @RequestBody TrackingInfo trackingInfo) {
        trackingInfo.setId(id);
        return trackingInfoService.save(trackingInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteTrackingInfo(@PathVariable Long id) {
        trackingInfoService.delete(id);
    }
}
