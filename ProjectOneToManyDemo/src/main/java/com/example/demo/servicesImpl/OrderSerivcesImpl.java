package com.example.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.OrderRepo;
import com.example.demo.model.Order;
import com.example.demo.services.OrderSerivces;
@Service
public class OrderSerivcesImpl implements OrderSerivces {
   @Autowired
    OrderRepo orderRepo;
	@Override
	public Order saveOrder(Order order) {
		return  orderRepo. save(order);
	}

	@Override
	public List<Order> listOrder() {
		return orderRepo.findAll();
		
	}

	@Override
	public Order updateOrder(Order order) {
		
		return orderRepo.save(order);
	}

	@Override
	public String deleteOrder(Order order) {
		orderRepo.delete(order);
		return "";
	}

}
