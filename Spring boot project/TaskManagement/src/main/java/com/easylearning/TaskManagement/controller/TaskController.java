package com.easylearning.TaskManagement.controller;
import com.easylearning.TaskManagement.payloads.TaskDto;
import com.easylearning.TaskManagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService taskService;

    //save the task
    @PostMapping("/{userId}/tasks")
    public ResponseEntity<TaskDto> saveTask(@PathVariable(name = "userId") long id, @RequestBody TaskDto taskDto){
        return new ResponseEntity<>(taskService.saveTask(id,taskDto), HttpStatus.CREATED);
    }

    //get all task
     @GetMapping("/{userId}/tasks")
    public ResponseEntity<List<TaskDto>> getAllTasks(@PathVariable(name = "userId") long userId){
        return new ResponseEntity<>(taskService.getAllTasks(userId),HttpStatus.OK);
     }
    //get individual task

    //delete individual task
}
