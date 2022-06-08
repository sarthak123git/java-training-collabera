package com.spring.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Employee;

@RestController
public class EmpContro {

     @GetMapping("/") 
	public String  getEmp() {
		return "sarthak";
	}
     @GetMapping("/employees/{id}")
     public String getEmployee(@PathVariable("id") Long id) {
    	 return "fetch emp details id"+ id;
     }
     @DeleteMapping("/employees")
     public String deleteEmp(@RequestParam("id") Long id) {
    	 return "Delete"+ id;
     }
     @PostMapping("/employees")
     public String addEmp(@RequestBody Employee employee) {
    	 return "employee details" + employee;
     }
}
