package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;


@Service
public interface EmployeeService {
	
	public List<Employee> getAllEmployees() throws EmployeeNotFoundException;
	
    public Employee getEmployeeDetails(long empId) throws EmployeeNotFoundException;

    public void createEmployee(Employee employee) throws EmployeeNotFoundException;
    
    public void deleteEmployee(long empId);
       
    public Employee updateEmployee(Employee employee);


}
