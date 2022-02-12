package com.springCrud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
	
	@GetMapping("/home")
	public String show() {
		
		return "index";
	}

}
