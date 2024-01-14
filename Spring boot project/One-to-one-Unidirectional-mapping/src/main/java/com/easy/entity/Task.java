package com.easy.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "task_table")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int taskId;
	
	private String taskName;
	

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}
	
	

}
