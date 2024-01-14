package com.easy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easy.entity.Employee;
import com.easy.entity.Task;
import com.easy.repo.EmployeeRepo;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner{

	
	@Autowired
    EmployeeRepo employeeRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee emp1= new Employee("saddam hussain");
		
		Employee emp2= new Employee("Naveen");
		
		Task task1=new Task("UI related issues");
		Task task2=new Task("Login related issues");
		Task task3=new Task("Registration related issues");
		
		Task task4=new Task("Deployment issues");
		Task task5=new Task("Infrastructure issues");
		
		
		emp1.getTasks().add(task1);

		emp1.getTasks().add(task2);
		
		emp1.getTasks().add(task3);
		
		
		
		emp2.getTasks().add(task4);
		
		emp2.getTasks().add(task5);
		

		employeeRepo.save(emp1);
		
		employeeRepo.save(emp2);
	}	

}
