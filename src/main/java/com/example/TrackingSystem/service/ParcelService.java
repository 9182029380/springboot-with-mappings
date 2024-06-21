package com.example.TrackingSystem.service;

import com.example.TrackingSystem.model.Parcel;

import java.util.List;

public interface ParcelService {
    List<Parcel> findAll();
    Parcel findById(Long id);
    Parcel save(Parcel parcel);
    void delete(Long id);
}
