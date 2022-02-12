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

import com.example.demo.model.Order;
import com.example.demo.servicesImpl.OrderSerivcesImpl;

@RestController
@RequestMapping("order")
public class OrderComtroller {
	@Autowired
	OrderSerivcesImpl orderSerivcesImpl;
	@PostMapping("save")
	public Order add(@RequestBody Order order)
	{
		return orderSerivcesImpl.saveOrder(order);
	}
	@GetMapping("read")
	public List<Order> read()
	{
		return orderSerivcesImpl.listOrder();
	}
	@PutMapping("update")
	public Order update(@RequestBody Order order)
	{
		return orderSerivcesImpl.updateOrder(order);
	}
	@DeleteMapping("Delete")
	public String Delete(@RequestBody Order order)
	{
		return orderSerivcesImpl.deleteOrder(order);
	}

}
