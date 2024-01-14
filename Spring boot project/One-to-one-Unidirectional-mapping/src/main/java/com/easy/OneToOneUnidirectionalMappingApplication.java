package com.easy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easy.entity.Employee;
import com.easy.entity.Task;
import com.easy.repo.EmployeeRepo;



@SpringBootApplication
public class OneToOneUnidirectionalMappingApplication implements CommandLineRunner  {

	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneUnidirectionalMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee emp1= new Employee("Naveen");
		Employee emp2= new Employee("Hussain");
		
		
		Task task1 = new Task("Login issues is assign to hussain");
		Task task2 = new Task("Registration issues is assign to Naveen");
		
		
		emp1.setTask(task2);
		emp2.setTask(task1);
		
		employeeRepo.save(emp1);
		
		employeeRepo.save(emp2);
		
		
		
	}



}
