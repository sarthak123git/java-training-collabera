package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service3 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId3;
	private String employeeName3;
	private String employeeDept3;
	
	public Service3() {
		super();
	}
	@Override
	public String toString() {
		return "Service3 [employeeId3=" + employeeId3 + ", employeeName3=" + employeeName3 + ", employeeDept3="
				+ employeeDept3 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeDept3, employeeId3, employeeName3);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Service3 other = (Service3) obj;
		return Objects.equals(employeeDept3, other.employeeDept3) && employeeId3 == other.employeeId3
				&& Objects.equals(employeeName3, other.employeeName3);
	}
	public int getEmployeeId3() {
		return employeeId3;
	}
	public void setEmployeeId3(int employeeId3) {
		this.employeeId3 = employeeId3;
	}
	public String getEmployeeName3() {
		return employeeName3;
	}
	public void setEmployeeName3(String employeeName3) {
		this.employeeName3 = employeeName3;
	}
	public String getEmployeeDept3() {
		return employeeDept3;
	}
	public void setEmployeeDept3(String employeeDept3) {
		this.employeeDept3 = employeeDept3;
	}
	
	
}
