package com.spring.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Employee;
import com.spring.repository.EmpRepo;
import com.spring.service.EmpService;
@Service
public class EmpServiceimpl implements EmpService {
	@Autowired
	private EmpRepo repo;

	@Override
	public List<Employee> getAllEmp() {
		return repo.findAll();
	}

	@Override
	public void saveEmp(Employee e) {
      repo.save(e)		;
	}

	@Override
	public void updateEmp(Employee e) {
     repo.save(e);
		
	}

	@Override
	public void deleteEmp(Employee e) {
		repo.delete(e);
		
	}

	@Override
	public Employee getEmpById(int id) {
	
	  Optional<Employee>employee= repo.findById(id);
	  if(employee.isPresent()) {
		  return employee.get();
	  }
	  throw new RuntimeException("not found");

}}
