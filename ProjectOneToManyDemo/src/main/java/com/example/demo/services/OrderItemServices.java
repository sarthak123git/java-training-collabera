package com.example.demo.services;

import java.util.List;

import com.example.demo.model.OrderItem;



public interface OrderItemServices
{
	 public OrderItem saveOderItem(OrderItem orderItem);
	    public List<OrderItem> listOderItem();
	    public OrderItem updateOderItem(OrderItem orderItem);
	    public String deleteOderItem(OrderItem orderItem);
}
