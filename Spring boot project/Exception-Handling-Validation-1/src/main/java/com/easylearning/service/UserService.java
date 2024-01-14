package com.easylearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.easylearning.entity.User;
import com.easylearning.exception.UserNotFoundException;
import com.easylearning.repo.UserRepo;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repository;


    public User saveUser(User user) {
        
                
        return repository.save(user);
    }


    public List<User> getALlUsers() {
        return repository.findAll();
    }


    public User getUser(int id) throws UserNotFoundException {
        User user= repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id : "+id);
        }
    }
}
