package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.Service1Serc;
import com.example.demo.entity.Service1;
import com.example.demo.repository.Service1Repo;

@Service
public class Service1ServiceImpl implements Service1Serc {

	
	@Autowired
	private Service1Repo service1Repo;
	@Override
	public void saveData(Service1 service1) {
		// TODO Auto-generated method stub
		service1Repo.save(service1);
		
	}

	@Override
	public List<Service1> fetchdata() {
		// TODO Auto-generated method stub
		return service1Repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		service1Repo.deleteById(id);
	}

	@Override
	public void updatedata(Service1 service1) {
		// TODO Auto-generated method stub
		service1Repo.save(service1);
	}

}
