package com.postgres;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Springboot.Model.Actor;
import com.Springboot.Model.GetActors;

@SpringBootApplication
public class Chinook2Application {

	public static void main(String[] args) {
		SpringApplication.run(Chinook2Application.class, args);
		
		
		//GetActors.findCustomerByName("Enrique"); //Appendix B opgave 3 - VIRKER NOGENLUNDE KUNNE BRUGE ET FIX
		//GetActors.findCustomerById(50); //Appendix B opgave 2 - Read specific customer by ID
		
		//GetActors.getCustomer(); //Appendix B opgave 1 - Read all customers in the database
		
		/*Actor conn  = new Actor();
		conn.test();*/ //Connection test
		
		
	}


	}

