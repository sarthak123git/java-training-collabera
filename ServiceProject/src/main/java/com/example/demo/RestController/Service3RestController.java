package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.Service3Serviceimpl;
import com.example.demo.entity.Service1;
import com.example.demo.entity.Service3;

@RestController
public class Service3RestController {
	@Autowired
	private Service3Serviceimpl service3Serviceimpl;
	
	@PostMapping("/save3")
	private void saveService3(@RequestBody Service3 service3)
	{
		service3Serviceimpl.saveData(service3);
	}
	@GetMapping("/list3")
	private List<Service3>listService3()
	{
		return service3Serviceimpl.fetchdata();
		
	}
	@DeleteMapping("/delete3{id}")
	private void deleteService3(@PathVariable int id)
	{
		service3Serviceimpl.delete(id);
		
	}
	
	@PutMapping("/put3")
	private void updateService3(@RequestBody Service3 service3)
	{
		service3Serviceimpl.saveData(service3);
	}
}
