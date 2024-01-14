package com.employee.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/listOfEmployees")
	public ResponseEntity<?> getAllEmployees() throws EmployeeNotFoundException {

		if (!employeeRepository.findAll().isEmpty()) {

			return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.ACCEPTED);
		} else {

			throw new EmployeeNotFoundException("Employee list is Empty");
		}

	}

	@PostMapping("/createEmployee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) throws EmployeeNotFoundException {

		Optional<Employee> opt = employeeRepository.findByName(employee.getEmailId());
		if (opt.isPresent()) {
			throw new EmployeeNotFoundException("Employee EmailId is already saved");
		} else {
			employeeService.createEmployee(employee);
			return new ResponseEntity<>("Employee Details Saved Successfully in Database", HttpStatus.OK);
		}

	}

	@GetMapping("/getEmployeeDetails/{empId}")
	public ResponseEntity<?> getEmployeeDetails(@PathVariable(value = "empId") Long empId)
			throws EmployeeNotFoundException {

		Optional<Employee> opt1 = employeeRepository.findById(empId);

		if (opt1.isPresent()) {

			Employee emp = employeeService.getEmployeeDetails(empId);

			return new ResponseEntity<>(emp, HttpStatus.OK);
		} else {

			throw new EmployeeNotFoundException("Employee Id is not Found");
		}

	}

	@DeleteMapping("/deleteEmployeeDetails/{empId}")
	public ResponseEntity<?> deleteEmployeeDetails(@PathVariable(value = "empId") long empId) throws EmployeeNotFoundException {

		Optional<Employee> opt1 = employeeRepository.findById(empId);

		
		
		if (opt1.isPresent()) {
			
			employeeService.deleteEmployee(empId);

			return new ResponseEntity<>("Employee Details Deleted Successfully", HttpStatus.OK);
		} else {

			throw new EmployeeNotFoundException("Employee Id is not Found");
		}
	}
	
	@PutMapping("/updateEmployee/{empId}")
	public ResponseEntity<?> updateEmployeeDetails(@RequestBody Employee employee) throws EmployeeNotFoundException{
		
		Optional<Employee> opt=employeeRepository.findById(employee.getId());
		if(opt.isPresent()) {
			Employee updateEmployee = opt.get();
			
			updateEmployee.setEmailId(employee.getEmailId());
			updateEmployee.setFirstName(employee.getFirstName());
			updateEmployee.setLastName(employee.getLastName());
			
			employeeService.updateEmployee(updateEmployee);
			
			return new ResponseEntity<>("Employee Details Updated Successfully", HttpStatus.OK);
		}else {
			
			throw new EmployeeNotFoundException("Employee Id is not Found");
		}
		
	}
}
