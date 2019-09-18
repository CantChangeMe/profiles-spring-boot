package com.vivek.profile.profilesspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class WelcomeController {
	
	@Value("${app.message}")
	private String welcomeMessage;
	@GetMapping("/welcome")
	public String getMessage() {
		
		return "Welcome "+welcomeMessage;
	}
}
