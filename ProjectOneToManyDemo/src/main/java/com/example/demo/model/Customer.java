package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String fullname;
	private String email;
	@OneToMany()
	List<Order> order;
	public List<Order> getOrder() {
	return order;
	}
	public void setOrder(List<Order> order) {
	this.order = order;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getFullname() {
	return fullname;
	}
	public void setFullname(String fullname) {
	this.fullname = fullname;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public Customer(int id, String fullname, String email) {
	super();
	this.id = id;
	this.fullname = fullname;
	this.email = email;
	}
	public Customer() {
	super();
	// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	return "Customer [id=" + id + ", fullname=" + fullname + ", email=" + email + "]";
	}
}
