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

import com.example.demo.ServiceImpl.Service1ServiceImpl;
import com.example.demo.entity.Service1;

@RestController
public class Service1RestController {
	@Autowired
	private Service1ServiceImpl service1ServiceImpl;
	
	@PostMapping("/save1")
	private void saveService1(@RequestBody Service1 service1)
	{
		service1ServiceImpl.saveData(service1);
	}
	
	@GetMapping("/list1")
	private List<Service1>listService1()
	{
		return service1ServiceImpl.fetchdata();
		
	}
	@DeleteMapping("/delete1{id}")
	private void deleteService1(@PathVariable int id)
	{
		service1ServiceImpl.delete(id);
		
	}
	
	@PutMapping("/put1")
	private void updateService1(@RequestBody Service1 service1)
	{
		service1ServiceImpl.saveData(service1);
	}
}
