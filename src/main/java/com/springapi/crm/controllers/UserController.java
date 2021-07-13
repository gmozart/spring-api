package com.springapi.crm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.crm.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/")
	public User teste() {
		
		User user = new User();
		
		user.setId(1L);
		user.setName("Gleison");
		user.setUsername("gleisonmozart");
		
		return user;
	}
	
}
