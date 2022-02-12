package com.springCrud;

	import java.util.List;
	 
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	 
	@RestController
	public class PersonRestcontroller {
	    @Autowired
	    private PersonRepository personRepository;
	 
	    @GetMapping("/")
	    public List<Person> getAllPerson() {
	        return personRepository.findAll();
	    }
	 
	    @PostMapping("/")
	    public Person savePerson(@RequestBody Person person) {
	        return personRepository.save(person);
	    }
	 
	    @PutMapping("/")
	    public Person updatePerson(@RequestBody Person person) {
	        return personRepository.save(person);
	    }
	 
	    @DeleteMapping("/")
	    public String deletePerson(@RequestBody Person person) {
	        personRepository.delete(person);
	        return "deleted Successfully";
	    }
	}
