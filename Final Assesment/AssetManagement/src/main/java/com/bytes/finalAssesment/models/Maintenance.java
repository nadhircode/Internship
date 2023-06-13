package com.bytes.finalAssesment.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maintenance_id")
    private Long maintenanceId;

    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Asset asset;

    @Column(name = "maintenance_date")
    private LocalDate maintenanceDate;

    @Column(name = "technician")
    private String technician;

    @Column(name = "description")
    private String description;
    
    @Column(name = "maintenance_status")
    private String maintenance_status;

	public Maintenance(Long maintenanceId, Asset asset, LocalDate maintenanceDate, String technician,
			String description, String maintenance_status) {
		super();
		this.maintenanceId = maintenanceId;
		this.asset = asset;
		this.maintenanceDate = maintenanceDate;
		this.technician = technician;
		this.description = description;
		this.maintenance_status = maintenance_status;
	}

	public Long getMaintenanceId() {
		return maintenanceId;
	}

	public void setMaintenanceId(Long maintenanceId) {
		this.maintenanceId = maintenanceId;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public LocalDate getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(LocalDate maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

	public String getTechnician() {
		return technician;
	}

	public void setTechnician(String technician) {
		this.technician = technician;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaintenance_status() {
		return maintenance_status;
	}

	public void setMaintenance_status(String maintenance_status) {
		this.maintenance_status = maintenance_status;
	}

    // Constructors, getters, setters
    
}

