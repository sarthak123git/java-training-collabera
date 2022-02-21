package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Service1;

@Repository
public interface Service1Repo extends JpaRepository<Service1, Integer> {

}
