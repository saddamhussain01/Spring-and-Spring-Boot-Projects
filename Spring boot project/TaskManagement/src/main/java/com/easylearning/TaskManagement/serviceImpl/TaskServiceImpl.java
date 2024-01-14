package com.easylearning.TaskManagement.serviceImpl;

import com.easylearning.TaskManagement.entity.Task;
import com.easylearning.TaskManagement.entity.Users;
import com.easylearning.TaskManagement.exception.UserNotFoundException;
import com.easylearning.TaskManagement.payloads.TaskDto;
import com.easylearning.TaskManagement.repository.TaskRepository;
import com.easylearning.TaskManagement.repository.UserRepository;
import com.easylearning.TaskManagement.service.TaskService;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDto saveTask(long userId, TaskDto taskDto) {

       Users user=userRepository.findById(userId).orElseThrow(
               () -> new UserNotFoundException(String.format("User Id %d not found",userId))
       );
       Task task=modelMapper.map(taskDto, Task.class);
       task.setUser(user);
       //After setting the user, we are storing tha data in DB
       Task savedTask = taskRepository.save(task);
        return modelMapper.map(savedTask,TaskDto.class);
    }

    @Override
    public List<TaskDto> getAllTasks(long userId) {
       userRepository.findById(userId).orElseThrow(
                () -> new UserNotFoundException(String.format("User Id %d not found",userId))
        );
       List<Task> tasks = taskRepository.findAllByUserId(userId);
        return tasks.stream().map(
                task -> modelMapper.map(task,TaskDto.class)
        ).collect(Collectors.toList());
    }
}
