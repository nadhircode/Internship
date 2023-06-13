package com.bytes.finalAssesment.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.finalAssesment.Repository.AssetRepository;
import com.bytes.finalAssesment.Repository.AssignmentRepository;
import com.bytes.finalAssesment.Repository.EmployeeRepository;
import com.bytes.finalAssesment.models.Asset;
import com.bytes.finalAssesment.models.Assignment;
import com.bytes.finalAssesment.models.Employee;

import jakarta.transaction.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AssignmentService {
    private final AssignmentRepository assignmentRepository;
    private final AssetRepository assetRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public AssignmentService(AssignmentRepository assignmentRepository, AssetRepository assetRepository, EmployeeRepository employeeRepository) {
        this.assignmentRepository = assignmentRepository;
        this.assetRepository = assetRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    public Assignment getAssignmentById(Long id) {
        return assignmentRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Asset not found"));
    }

//    public Assignment createAssignment(Assignment assignment) {
//    	Optional<Employee> employee = employeeRepository.findById(assignment.getEmployee().getEmployeeId());
//    	Optional<Asset> asset = assetRepository.findById(assignment.getAsset().getAssetId());
//       
//    	assignment.setAsset(asset.get());
//    	assignment.setEmployee(employee.get());
//    	// Additional business logic if needed
//        return assignmentRepository.save(assignment);
//    }

    public Assignment updateAssignment(Assignment assignment) {
        // Additional business logic if needed
        return assignmentRepository.save(assignment);
    }

    public void deleteAssignment(Long id) {
        assignmentRepository.deleteById(id);
    }
    
    
    @Transactional
    public Assignment assignAssetToEmployee(Long assetId, Long employeeId, String location) {
        Asset asset = assetRepository.findById(assetId)
                .orElseThrow(() -> new NoSuchElementException("Asset not found"));

      Employee employee=   employeeRepository.findById(employeeId)
                .orElseThrow(() -> new NoSuchElementException("Employee not found"));

        Assignment assignment = new Assignment();
//        assignment.setAsset_id(assetId);
//        assignment.setEmployee_id(employeeId);
        assignment.setAssignmentDate(LocalDate.now());

        asset.setCurrentLocation(location); // Update asset's current location
        asset.setStatus("Asset assigned");
        asset.setEmployee(employee);
        assetRepository.updateAssetLocation(assetId, location);
        assetRepository.updateAssetStatus(assetId, "Asset Assigned");
        
        assignment.setAsset(asset); // Set the asset for the assignment
        assignment.setEmployee(employee); // Set the employee for the assignment
        

        
        assetRepository.save(asset);
        

        return assignmentRepository.save(assignment);
    }
    
    public void unassignAssetFromEmployee(Long assignmentId) {
        Assignment assignment = assignmentRepository.findById(assignmentId)
                .orElseThrow(() -> new NoSuchElementException("Assignment not found"));

        assignmentRepository.delete(assignment);

        // Update asset's current location to indicate unassignment
        Asset asset = assignment.getAsset();
        asset.setCurrentLocation("Unassigned"); // Update asset's current location
        asset.setStatus("Asset Unassigned");
        assetRepository.save(asset);
    }
    
    
}

