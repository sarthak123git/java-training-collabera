package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)

	 private Long studId;
	 private String studeName;
	 private String studPhn,studAddress;
	 
}

