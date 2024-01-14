package com.example.SpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootConfiguration // It is making our classes a configuration  class of spring
//@EnableAutoConfiguration //  It is an enabling autoconfiguration
//@ComponentScan           // It keeps the scan whole application for us to find out @service, @repository,@controller
public class SpringBootProjectApplication {

	public static void main(String[] args) {

		//It starts the embedded tomcat server for us
		SpringApplication.run(SpringBootProjectApplication.class, args);

		System.out.println("welcome to Easy Learning Channel");
	}

}
