package com.example.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.OrderItemRepo;
import com.example.demo.model.OrderItem;
import com.example.demo.services.OrderItemServices;
@Service
public class OrderItemServicesImpl implements OrderItemServices {
   @Autowired
   OrderItemRepo orderItemRepo;
	@Override
	public OrderItem saveOderItem(OrderItem orderItem) {
		return orderItemRepo.save(orderItem);
		
	}

	@Override
	public List<OrderItem> listOderItem() {
		return orderItemRepo.findAll();
	}

	@Override
	public OrderItem updateOderItem(OrderItem orderItem) {
		
		return orderItemRepo.save(orderItem);
	}

	@Override
	public String deleteOderItem(OrderItem orderItem) {
		orderItemRepo.delete(orderItem);
		return"remove from oderItem ";
	}

}
