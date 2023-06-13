package com.bytes.finalAssesment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytes.finalAssesment.models.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    // Add custom query methods if needed
}

