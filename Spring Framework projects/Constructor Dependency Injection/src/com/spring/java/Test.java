package com.spring.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		
		
		Employee emp = context.getBean(Employee.class);
		
		
		emp.showDetails();
		
		

	}

}
