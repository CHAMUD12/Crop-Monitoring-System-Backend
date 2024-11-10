package org.example.cropmonitoringsystembackend.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.cropmonitoringsystembackend.dto.impl.CropDTO;
import org.example.cropmonitoringsystembackend.service.CropService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CropServiceIMPL implements CropService {
    @Override
    public void saveCrop(CropDTO cropDTO) {

    }

    @Override
    public List<CropDTO> searchCrops(String cropCode, String cropCommonName) {
        return List.of();
    }

    @Override
    public List<CropDTO> getAllCrops() {
        return List.of();
    }

    @Override
    public void deleteCrop(String cropCode) {

    }

    @Override
    public void updateCrop(String cropCode, CropDTO cropDTO) {

    }
}
