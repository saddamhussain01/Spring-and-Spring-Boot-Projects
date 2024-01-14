package com.springboot.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootprofiles {

	private static Logger LOGGER = LoggerFactory.getLogger(Springbootprofiles.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Springbootprofiles.class, args);
		
		LOGGER.info("Springboot profiles application is running successfully.");
	}
}
