package com.easylearning.TaskManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TaskNotFoundException extends RuntimeException{

    private String message;

    public TaskNotFoundException(String message) {
        super(message);
        this.message=message;
    }
}
