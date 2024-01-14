package com.easylearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.easylearning.entity.Employee;
import com.easylearning.repository.EmpRepository;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpRepository repo;
	
	@PostMapping("/save")
	public Employee saveREmp(@RequestBody Employee employee) {
		
		return repo.save(employee);
		
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmp(){
		
		return repo.findAll();
	
		
	}
	
	
	@GetMapping()
	public Employee getEmp(@RequestParam int empId) {
		return repo.findById(empId).get();
	}

}
