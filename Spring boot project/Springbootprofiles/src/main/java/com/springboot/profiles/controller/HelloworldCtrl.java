package com.springboot.profiles.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class HelloworldCtrl {
	
	private static Logger LOGGER = LoggerFactory.getLogger(HelloworldCtrl.class);
	
	// The message attribute value is populated based on the selected profile
	@Value(value = "${spring.message}")
	private String message;

	@GetMapping(value = "/hello")
	public String welcome() {
		LOGGER.info("Returning the response.");
		return message;
	}
}
