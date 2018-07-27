package com.csrf.test.CSRFTest.dao;

import java.util.List;

import com.csrf.test.CSRFTest.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee cus);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);
}