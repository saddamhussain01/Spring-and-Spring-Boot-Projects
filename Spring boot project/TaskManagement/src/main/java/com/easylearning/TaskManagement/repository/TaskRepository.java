package com.easylearning.TaskManagement.repository;

import com.easylearning.TaskManagement.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    List<Task> findAllByUserId(long userId);
}
