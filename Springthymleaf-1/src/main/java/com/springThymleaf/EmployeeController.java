package com.springThymleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	 @Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	 
	@PostMapping("/save")
	public Employee savEmployee(@RequestBody Employee employee) {
		return employeeServiceImpl.savEmployee(employee);
	}
	 
	
	@GetMapping("/read")
	public List<Employee> getEmployee(){
		return employeeServiceImpl.getEmployee();
	}
	
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
		return employeeServiceImpl.updateEmployee(employee);
	}
	 
	@DeleteMapping("/delete")
	public String delete(@RequestBody Employee employee)
	{
		return employeeServiceImpl.deleteEmployee(employee);
	}

}
