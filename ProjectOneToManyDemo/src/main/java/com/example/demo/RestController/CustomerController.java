package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.servicesImpl.CustomerServicesImpl;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	CustomerServicesImpl customerServicesImpl;
	@PostMapping("save")
	public Customer add(@RequestBody Customer customer)
	{
		return customerServicesImpl.saveCustomer(customer);
	}
	@GetMapping("read")
	public List<Customer> read()
	{
		return customerServicesImpl.listCustomer();
	}
	@PutMapping("update")
	public Customer update(@RequestBody Customer customer)
	{
		return customerServicesImpl.updateCustomer(customer);
	}
	@DeleteMapping("Delete")
	public String delete(@RequestBody Customer customer)
	{
		return customerServicesImpl.deleteCustomer(customer);
	}

}
