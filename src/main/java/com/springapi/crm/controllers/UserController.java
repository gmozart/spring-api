package com.springapi.crm.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.crm.model.User;
import com.springapi.crm.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> users = new ArrayList<>();

	@GetMapping("/{id}")
	public User user(@PathVariable("id") Long id) {
		
		
		Optional<User> userFind = this.userRepo.findById(id);
		
		if(userFind.isPresent()){
			
			return userFind.get();
		}
		
		
			return null;
	
	}
	
	@PostMapping("/")
	public User user(@RequestBody User user) {
		
		
		return this.userRepo.save(user);
	}
	
	@GetMapping("/list")
    public List<User> list(){
		
		
		return this.userRepo.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id){
		
		userRepo.deleteById(id);
		
		return ResponseEntity.noContent().build();
		
	}
	
}
