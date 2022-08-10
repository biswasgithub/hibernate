package com.hibernate.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.onetomany.entities.Library;
import com.hibernate.onetomany.repositories.LibraryRepository;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryRepository libraryRepository;
	
	@PostMapping(value="/library")
	public ResponseEntity<Library> add(@RequestBody Library library){
		Library result = libraryRepository.save(library);
		
		return new ResponseEntity<Library>(result,HttpStatus.CREATED);
	}

}
