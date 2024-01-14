package com.easylearning.TaskManagement.repository;

import com.easylearning.TaskManagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
