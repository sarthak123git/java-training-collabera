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

import com.example.demo.model.OrderItem;
import com.example.demo.servicesImpl.OrderItemServicesImpl;

@RestController
@RequestMapping("OrderItem")
public class OrderItemController 
{
   @Autowired
    OrderItemServicesImpl orderItemServicesImpl;
   @PostMapping("save")
   public OrderItem Add(@RequestBody OrderItem orderItem)
   {
	   return orderItemServicesImpl.saveOderItem(orderItem);
   }
   @GetMapping("read")
   public List<OrderItem> read()
   {
	   return orderItemServicesImpl.listOderItem();
	   
   }
   @PutMapping("update")
   public OrderItem update(@RequestBody OrderItem orderItem)
   {
	   return orderItemServicesImpl.updateOderItem(orderItem);
   }
   @DeleteMapping("delete")
   public String Delete(@RequestBody OrderItem orderItem)
   {
	   return orderItemServicesImpl.deleteOderItem(orderItem);
   }
}
