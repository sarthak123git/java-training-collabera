package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

@Entity
public class OrderItem {
	@javax.persistence.Id
	@GeneratedValue
	private int Id;
	private int quantity;
	private String product;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
	List<Order> order;
	public List<Order> getOrder() {
	return order;
	}
	public void setOrder(List<Order> order) {
	this.order = order;
	}
	public int getId() {
	return Id;
	}
	public void setId(int id) {
	Id = id;
	}
	public int getQuantity() {
	return quantity;
	}
	public void setQuantity(int quantity) {
	this.quantity = quantity;
	}
	public String getProduct() {
	return product;
	}
	public void setProduct(String product) {
	this.product = product;
	}
	public OrderItem(int id, int quantity, String product) {
	super();
	    this.Id = id;
	this.quantity = quantity;
	this.product = product;
	}
	public OrderItem() {
	super();
	// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	return "OrderItem [Id=" + Id + ", quantity=" + quantity + ", product=" + product + "]";
	}
}
