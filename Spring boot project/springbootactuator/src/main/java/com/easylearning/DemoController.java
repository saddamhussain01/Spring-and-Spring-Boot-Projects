package com.easylearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/hello")
	public String demo() {
		
		return "Hello welcome to Easy Learning Channel";
	}

}
