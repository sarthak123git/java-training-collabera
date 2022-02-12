package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Order;
public interface OrderSerivces {
	 public Order saveOrder(Order order);
	    public List<Order> listOrder();
	    public Order updateOrder(Order order);
	    public String deleteOrder(Order order);
}
