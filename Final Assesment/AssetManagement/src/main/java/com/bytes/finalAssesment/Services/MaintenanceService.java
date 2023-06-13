package com.bytes.finalAssesment.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bytes.finalAssesment.Repository.MaintenanceRepository;
import com.bytes.finalAssesment.models.Maintenance;

import java.util.List;

@Service
public class MaintenanceService {
    private final MaintenanceRepository maintenanceRepository;

    @Autowired
    public MaintenanceService(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    public List<Maintenance> getAllMaintenance() {
        return maintenanceRepository.findAll();
    }

    public Maintenance getMaintenanceById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    public Maintenance createMaintenance(Maintenance maintenance) {
        // Additional business logic if needed
        return maintenanceRepository.save(maintenance);
    }

    public Maintenance updateMaintenance(Maintenance maintenance) {
        // Additional business logic if needed
        return maintenanceRepository.save(maintenance);
    }

    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
