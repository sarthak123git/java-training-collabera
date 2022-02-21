package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Service3;

public interface Service3Serc {

	public void saveData(Service3 service3);		//Save data into the database
	public List<Service3> fetchdata();			//Retrieve data from the database
	public void delete(int id);					//Delete on the basic of id
	public void updatedata(Service3 service3);	//Update student into the database 
}
