package com.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datajpa.entity.Customer;
import com.datajpa.entity.Item;
import com.datajpa.repository.CustomerRepository;

@SpringBootApplication
public class ManyToManyBidirectionalApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ManyToManyBidirectionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
        Customer customer1= new Customer("saddam hussain");
		
		Customer customer2= new Customer("Naveen");
		
		Customer customer3= new Customer("sagar");
		
		Item item1=new Item("Mobile");
		Item item2=new Item("Laptop");
		Item item3=new Item("Earphones");
		
		Item item4=new Item("Headset");
		Item item5=new Item("Mouse");
		
		
		customer1.getItems().add(item1);

		customer1.getItems().add(item2);
		
		customer2.getItems().add(item3);
		
		
		
		customer3.getItems().add(item4);
		
		customer3.getItems().add(item5);
		
		
		
		customRepo.save(customer1);
		
		customRepo.save(customer2);
		
		customRepo.save(customer3);
		
	}

}
