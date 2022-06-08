package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Employee;
import com.spring.serviceImpl.EmpServiceimpl;

@RestController
public class EmpController {
	@Autowired
	private EmpServiceimpl empServiceimpl;
	
	@GetMapping("/get")
	public List<Employee> getAllEmp(){
		return empServiceimpl.getAllEmp();
	}
	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable int id) {
		return empServiceimpl.getEmpById( id);
	}

}
