package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.model.Employee;

// Provides CRUD operations
// @Repository and @Transactional annotations provided as a part of JpaRepository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
