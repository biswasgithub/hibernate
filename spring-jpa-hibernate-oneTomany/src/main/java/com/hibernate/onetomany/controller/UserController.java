package com.hibernate.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.onetomany.entities.User;
import com.hibernate.onetomany.services.UserServices;

@RestController
public class UserController {
	
	@Autowired
	UserServices userService;
	
	@GetMapping(value="/user/{id}")
	
	public ResponseEntity<User> getUser(@PathVariable Integer id){
		
		User user = userService.getUser(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@PostMapping(value="/users")
	
	public ResponseEntity<User> addUser(@RequestBody User user){
		
		User userResult = userService.addUser(user);
		return new ResponseEntity<User>(userResult,HttpStatus.CREATED);
	}

}
