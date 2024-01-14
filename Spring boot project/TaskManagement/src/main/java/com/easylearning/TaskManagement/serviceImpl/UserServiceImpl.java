package com.easylearning.TaskManagement.serviceImpl;

import com.easylearning.TaskManagement.entity.Users;
import com.easylearning.TaskManagement.payloads.UserDto;
import com.easylearning.TaskManagement.repository.UserRepository;
import com.easylearning.TaskManagement.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

        //UserDto is not an Entity of Users
        Users users=modelMapper.map(userDto,Users.class);//converted userDto to Users
        Users savedUser=userRepository.save(users); //Saved Users in DataBase
        return modelMapper.map(savedUser,UserDto.class);
    }


}
