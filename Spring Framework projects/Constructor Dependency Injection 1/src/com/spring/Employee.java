package com.spring;

public class Employee {
	
	
	private int empId;
	
	private String empName;
	
	private Address address;

	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	
	public void show() {
	
		
		System.out.println(empId+" "+empName);  
		
		System.out.println(address.toString());  
	
	}

}
