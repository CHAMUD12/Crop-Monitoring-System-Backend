package org.example.cropmonitoringsystembackend.service;

import org.example.cropmonitoringsystembackend.customObj.FieldResponse;
import org.example.cropmonitoringsystembackend.dto.impl.FieldDTO;

import java.util.List;

public interface FieldService {
    void saveField(FieldDTO fieldDTO);

    List<FieldDTO> getAllFields();

    FieldResponse getSelectedField(String fieldCode);

    void deleteField(String fieldCode);

    void updateField(String fieldCode, FieldDTO fieldDTO);
}
