package com.easy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
