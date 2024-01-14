package com.employee.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public List<Employee> getAllEmployees() throws EmployeeNotFoundException {
		
		return employeeRepository.findAll();
	}


	@Override
	public void createEmployee(Employee employee) throws EmployeeNotFoundException {

		employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployeeDetails(long empId) throws EmployeeNotFoundException {
		
		return employeeRepository.findById(empId).get();
	}


	@Override
	public void deleteEmployee(long empId) {
		
		employeeRepository.deleteById(empId);
		
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		
		
		return employeeRepository.save(employee);
		
	
	}


}
