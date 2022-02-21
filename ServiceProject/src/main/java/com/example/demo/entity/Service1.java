package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Service1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String employeeName;
	private String employeeDept;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Service3 service3;
	
	public Service1() {
		super();
	}
	
	public Service1(int employeeId, String employeeName, String employeeDept, Service3 service3) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.service3 = service3;
	}
	
	public Service3 getService3() {
		return service3;
	}
	public void setService3(Service3 service3) {
		this.service3 = service3;
	}
	@Override
	public String toString() {
		return "Service1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeDept, employeeId, employeeName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Service1 other = (Service1) obj;
		return Objects.equals(employeeDept, other.employeeDept) && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName);
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	
	

}
