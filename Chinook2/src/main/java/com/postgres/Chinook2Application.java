package com.postgres;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Springboot.Model.Actor;

@SpringBootApplication
public class Chinook2Application {

	public static void main(String[] args) {
		SpringApplication.run(Chinook2Application.class, args);
		
		Actor conn  = new Actor();
		conn.test();
		
		
	}


	}

