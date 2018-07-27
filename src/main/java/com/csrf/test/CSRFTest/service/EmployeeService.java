package com.csrf.test.CSRFTest.service;

import java.util.List;

import com.csrf.test.CSRFTest.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	void getEmployeeById(String empid);
}