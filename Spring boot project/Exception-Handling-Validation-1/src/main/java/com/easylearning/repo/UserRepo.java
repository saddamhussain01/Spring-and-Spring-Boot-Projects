package com.easylearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easylearning.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
  
	User findByUserId(int id);
}
