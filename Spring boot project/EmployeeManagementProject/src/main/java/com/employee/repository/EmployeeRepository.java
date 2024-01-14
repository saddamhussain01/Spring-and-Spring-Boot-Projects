package com.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//Query for selecting recipeName by using findByName
		@Query("SELECT e from Employee e WHERE e.emailId=:emailId ")
		  Optional<Employee> findByName(@Param("emailId") String name);
}
