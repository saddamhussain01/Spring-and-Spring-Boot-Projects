package com.employee.exception;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	


	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<?> recipeNotFoundExceptionMethod(EmployeeNotFoundException employeeNotFound){
		
		Map<String, Object> errorBody = new LinkedHashMap<>();
		
		errorBody.put("error", "Creation Failed");
		errorBody.put("timestamp", LocalDateTime.now());
		errorBody.put("details", employeeNotFound.getMessage());

		return new ResponseEntity<>(errorBody,HttpStatus.NOT_FOUND);
		
	}

	
}
