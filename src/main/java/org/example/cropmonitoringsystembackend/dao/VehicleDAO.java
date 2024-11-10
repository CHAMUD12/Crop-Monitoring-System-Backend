package org.example.cropmonitoringsystembackend.dao;

import org.example.cropmonitoringsystembackend.entity.impl.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleDAO extends JpaRepository<Vehicle, String> {
    List<Vehicle> findByVehicleCodeOrVehicleCategory(String vehicleCode, String vehicleCategory);
}
