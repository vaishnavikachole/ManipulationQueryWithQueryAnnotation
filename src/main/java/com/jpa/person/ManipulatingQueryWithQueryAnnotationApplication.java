package com.jpa.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.person.service.PersonService;

@SpringBootApplication
public class ManipulatingQueryWithQueryAnnotationApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(ManipulatingQueryWithQueryAnnotationApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		int id = 4;
		String newEmail = "neha97@gmail.com";
		
		personService.updateEmailById(id,newEmail);
		personService.deletePersonById(4);
	}
	
	
	

}
