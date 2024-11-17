package org.example.cropmonitoringsystembackend.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.cropmonitoringsystembackend.dao.CropDAO;
import org.example.cropmonitoringsystembackend.dao.FieldDAO;
import org.example.cropmonitoringsystembackend.dao.MonitoringLogDAO;
import org.example.cropmonitoringsystembackend.dao.StaffDAO;
import org.example.cropmonitoringsystembackend.dto.impl.MonitoringLogDTO;
import org.example.cropmonitoringsystembackend.service.MonitoringLogService;
import org.example.cropmonitoringsystembackend.util.Mapping;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MonitoringLogServiceIMPL implements MonitoringLogService {
    private final CropDAO cropDAO;
    private final FieldDAO fieldDAO;
    private final StaffDAO staffDAO;
    private final MonitoringLogDAO monitoringLogDAO;
    private final Mapping mapping;

    @Override
    public void saveMonitoringLog(MonitoringLogDTO monitoringLogDTO) {

    }

    @Override
    public List<MonitoringLogDTO> searchMonitoringLog(String searchTerm) {
        return List.of();
    }

    @Override
    public List<MonitoringLogDTO> getAllMonitoringLog() {
        return List.of();
    }

    @Override
    public void deleteMonitoringLog(String log_code) {

    }

    @Override
    public void updateMonitoringLog(String log_code, MonitoringLogDTO monitoringLogDTO) {

    }
}
