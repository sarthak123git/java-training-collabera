package com.springThymleaf;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	//save
	Employee savEmployee(Employee employee);
	
	//read
	
	List<Employee> getEmployee();
	
	//update
	
	Employee updateEmployee(Employee employee);
	
	//delete
	public String deleteEmployee(Employee employee);
	 
}
