package com.springapi.crm.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.crm.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	public List<User> users = new ArrayList<>();

	@GetMapping("/")
	public User teste() {
		
		User user = new User();
		
		user.setId(1L);
		user.setName("Gleison");
		user.setUsername("gleisonmozart");
		
		return user;
	}
	
	@PostMapping("/")
	public User user(@RequestBody User user) {
		
		users.add(user);
		
		return user;
	}
	
	@GetMapping("/list")
    public List<User> list(){
		
		
		return users;
	}	
	
}
