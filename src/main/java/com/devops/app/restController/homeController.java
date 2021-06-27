package com.devops.app.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class homeController {
	
	@GetMapping("hello")
	public String home() {
		return "i am Safia";
	}
	
}
