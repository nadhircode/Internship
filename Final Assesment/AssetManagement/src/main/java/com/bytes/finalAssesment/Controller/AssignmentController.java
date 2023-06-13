package com.bytes.finalAssesment.Controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytes.finalAssesment.Services.AssignmentService;
import com.bytes.finalAssesment.models.Assignment;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {

    private final AssignmentService assignmentService;

    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @GetMapping("/{assignmentId}")
    public ResponseEntity<Assignment> getAssignmentById(@PathVariable Long assignmentId) {
        Assignment assignment = assignmentService.getAssignmentById(assignmentId);
        return ResponseEntity.ok(assignment);
    }

    @PostMapping("/assign")
    public ResponseEntity<Assignment> assignAssetToEmployee(
            @RequestParam("assetId") Long assetId,
            @RequestParam("employeeId") Long employeeId,
            @RequestParam("location") String location
    ) {
        Assignment assignment = assignmentService.assignAssetToEmployee(assetId, employeeId, location);
        return ResponseEntity.ok(assignment);
    }
    // Other endpoints and methods for updating, deleting, and searching assignments
}

