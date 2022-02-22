package com.springThymleaf.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phno;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(int id, String name, String phno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", email=" + email + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
