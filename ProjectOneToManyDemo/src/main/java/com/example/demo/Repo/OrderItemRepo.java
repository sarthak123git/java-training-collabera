package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrderItem;
@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> 
{

}
