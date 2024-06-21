package com.example.TrackingSystem.service;

import com.example.TrackingSystem.model.Parcel;
import com.example.TrackingSystem.repository.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelServiceImpl implements ParcelService {

    @Autowired
    private ParcelRepository parcelRepository;

    @Override
    public List<Parcel> findAll() {
        return parcelRepository.findAll();
    }

    @Override
    public Parcel findById(Long id) {
        return parcelRepository.findById(id).orElse(null);
    }

    @Override
    public Parcel save(Parcel parcel) {
        return parcelRepository.save(parcel);
    }

    @Override
    public void delete(Long id) {
        parcelRepository.deleteById(id);
    }
}
