package com.spring.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Employee {
	
	private int id;
	 
	private String name;
	private String city;

}
