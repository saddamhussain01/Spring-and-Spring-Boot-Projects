package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		Employee emp=context.getBean(Employee.class);
		
		
		emp.show();
		

	}

}
