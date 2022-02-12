package com.springCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"entity"} )

public class SpringBootCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrud1Application.class, args);
	}

}
