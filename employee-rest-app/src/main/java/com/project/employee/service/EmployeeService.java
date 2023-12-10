package com.project.employee.service;

import java.util.List;

import com.project.employee.model.Employee;

public interface EmployeeService {
	
	Employee savEmployee(Employee employee);
	
	List<Employee> getEmployees();
	
	Employee getEmployeeById(long id);
	
	Employee updateEmployee(Employee employee, long id);
	
	void deleteEmployee(long id);

}
