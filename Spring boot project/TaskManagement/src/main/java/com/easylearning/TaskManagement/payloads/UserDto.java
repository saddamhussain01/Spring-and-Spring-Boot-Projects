package com.easylearning.TaskManagement.payloads;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

    private long id;
    private String name;
    private String email;
    private String password;

}
