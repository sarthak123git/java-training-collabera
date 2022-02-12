package com.example.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.CustomerRepo;
import com.example.demo.model.Customer;
import com.example.demo.services.CustomerServices;
@Service
public class CustomerServicesImpl implements CustomerServices {
   @Autowired
    CustomerRepo customerRepo;
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> listCustomer() {
		
		return customerRepo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public String deleteCustomer(Customer customer) {
		 customerRepo.delete(customer);
		return "Done Remove From Database";
	}

	

}
