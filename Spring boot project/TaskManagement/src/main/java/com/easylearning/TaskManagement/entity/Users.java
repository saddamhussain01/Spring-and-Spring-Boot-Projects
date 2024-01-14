package com.easylearning.TaskManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_email"})
})
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(name = "user_email",nullable = false)
    private String email;
    @Column(name = "user_Password",nullable = false)
    private String password;

}
