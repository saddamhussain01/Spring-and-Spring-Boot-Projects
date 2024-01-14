package com.easy.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.easy.University;

@Service
public class AlphaUniversity implements University{

	@Override
	public String display() {
		
	     return "This is a message from Alpha University"; 
	}

}
