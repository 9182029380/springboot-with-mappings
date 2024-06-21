package com.example.TrackingSystem.controller;

import com.example.TrackingSystem.model.Parcel;
import com.example.TrackingSystem.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parcels")
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    @GetMapping
    public List<Parcel> getAllParcels() {
        return parcelService.findAll();
    }

    @GetMapping("/{id}")
    public Parcel getParcelById(@PathVariable Long id) {
        return parcelService.findById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Parcel createParcel(@RequestBody Parcel parcel) {
        return parcelService.save(parcel);
    }

    @PutMapping("/{id}")
    public Parcel updateParcel(@PathVariable Long id, @RequestBody Parcel parcel) {
        parcel.setId(id);
        return parcelService.save(parcel);
    }

    @DeleteMapping("/{id}")
    public void deleteParcel(@PathVariable Long id) {
        parcelService.delete(id);
    }
}
