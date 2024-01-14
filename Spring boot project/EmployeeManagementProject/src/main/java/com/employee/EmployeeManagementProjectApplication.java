package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.employee")
public class EmployeeManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementProjectApplication.class, args);
	}

}
