package com.easy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easy.University;


@RestController 
public class UniversityController { 

@Autowired 
//@Qualifier("Beta")
private University university; 

@GetMapping ("/university") 
public String getUniversity() { 

return university.display();

 }

 } 

