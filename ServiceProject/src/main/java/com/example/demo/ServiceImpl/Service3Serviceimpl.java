package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.Service1Serc;
import com.example.demo.Service.Service3Serc;
import com.example.demo.entity.Service3;
import com.example.demo.repository.Service1Repo;
import com.example.demo.repository.Service3Repo;

@Service
public class Service3Serviceimpl implements Service3Serc{

	
	@Autowired
	private Service3Repo service3Repo;
	@Override
	public void saveData(Service3 service3) {
		// TODO Auto-generated method stub
		service3Repo.save(service3);
		
	}

	@Override
	public List<Service3> fetchdata() {
		// TODO Auto-generated method stub
		return service3Repo.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		service3Repo.deleteById(id);
	}

	@Override
	public void updatedata(Service3 service3) {
		// TODO Auto-generated method stub
		service3Repo.save(service3);
	}

}
