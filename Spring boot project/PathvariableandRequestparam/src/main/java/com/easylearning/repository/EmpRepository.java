package com.easylearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easylearning.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
