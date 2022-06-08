package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.Employee;

@Service
public interface EmpService {
	
	public List<Employee> getAllEmp();
	
	Employee getEmpById(int id);
	public  void saveEmp(Employee e);
	
	public void  updateEmp(Employee e);
	
	public void deleteEmp(Employee e);
	

}
