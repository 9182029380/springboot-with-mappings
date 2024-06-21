package com.example.TrackingSystem.repository;

import com.example.TrackingSystem.model.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {
}
