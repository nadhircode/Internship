package com.bytes.finalAssesment.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.finalAssesment.Services.MaintenanceService;
import com.bytes.finalAssesment.models.Maintenance;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @GetMapping("/{maintenanceId}")
    public ResponseEntity<Maintenance> getMaintenanceById(@PathVariable Long maintenanceId) {
        Maintenance maintenance = maintenanceService.getMaintenanceById(maintenanceId);
        return ResponseEntity.ok(maintenance);
    }

    @PostMapping
    public ResponseEntity<Maintenance> createMaintenance(@RequestBody Maintenance maintenance) {
        Maintenance createdMaintenance = maintenanceService.createMaintenance(maintenance);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMaintenance);
    }

    // Other endpoints and methods for updating, deleting, and searching maintenance records
}
