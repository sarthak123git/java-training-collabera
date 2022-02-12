package com.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entities.User;

public interface UserRepo extends CrudRepository<User, Integer>{
	//custom finder name
	//created method by developer
	public List<User> findByName(String name);

}
