package com.easylearning.TaskManagement.service;

import com.easylearning.TaskManagement.payloads.TaskDto;

import java.util.List;

public interface TaskService {

    public TaskDto saveTask(long userId, TaskDto taskDto);
    public List<TaskDto> getAllTasks(long userId);

}
