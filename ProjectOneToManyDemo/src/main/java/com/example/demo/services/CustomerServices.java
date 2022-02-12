package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Customer;



public interface CustomerServices {
	 public Customer saveCustomer(Customer customer);
	    public List<Customer> listCustomer();
	    public Customer updateCustomer(Customer customer);
	    public String deleteCustomer(Customer customer);
}
