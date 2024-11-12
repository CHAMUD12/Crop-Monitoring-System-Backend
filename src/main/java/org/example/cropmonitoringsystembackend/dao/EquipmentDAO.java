package org.example.cropmonitoringsystembackend.dao;

import org.example.cropmonitoringsystembackend.entity.impl.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentDAO extends JpaRepository<Equipment, String> {
}
