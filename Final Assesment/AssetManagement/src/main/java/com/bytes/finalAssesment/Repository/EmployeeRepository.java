package com.bytes.finalAssesment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytes.finalAssesment.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Add custom query methods if needed
}

