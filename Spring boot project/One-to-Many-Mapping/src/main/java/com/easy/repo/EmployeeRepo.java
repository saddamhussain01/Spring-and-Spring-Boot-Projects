package com.easy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.easy.entity.Employee;

@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
