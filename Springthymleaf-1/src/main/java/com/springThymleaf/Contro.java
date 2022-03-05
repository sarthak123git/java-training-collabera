package com.springThymleaf;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class Contro {

	@RequestMapping(value = "/about", method=RequestMethod.GET)
	//@GetMapping("/about")
	private String about(Model model) {
		 
		System.out.println("run about");
		model.addAttribute("name", "Sarthak Kondekar");
		
		return "about";
	}
	
	@GetMapping("/loop")
	public String iterableHandler(Model m) {
		
		   List<String> names = List.of("sarthak","kajal","amar");
		   m.addAttribute("names", names);
		  
		return "iterate";
	}
 
}
