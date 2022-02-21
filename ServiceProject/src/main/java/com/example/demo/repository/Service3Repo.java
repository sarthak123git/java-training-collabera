package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Service3;

@Repository
public interface Service3Repo extends JpaRepository<Service3, Integer>{

}
