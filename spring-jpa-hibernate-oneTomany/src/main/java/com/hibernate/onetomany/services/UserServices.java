package com.hibernate.onetomany.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.onetomany.entities.User;
import com.hibernate.onetomany.repositories.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	UserRepository userRepository;
	
	public User getUser(Integer id) {
		Optional<User> user = userRepository.findById(id);
		
		return user.get();
	}

	public User addUser(User user) {
		User userResult = userRepository.save(user);
		return userResult;
	}
	
	
}
