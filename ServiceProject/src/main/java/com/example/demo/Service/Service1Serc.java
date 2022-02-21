package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Service1;



public interface Service1Serc {
	public void saveData(Service1 service1);		//Save data into the database
	public List<Service1> fetchdata();			//Retrieve data from the database
	public void delete(int id);					//Delete on the basic of id
	public void updatedata(Service1 service1);	//Update student into the database 

	
}
