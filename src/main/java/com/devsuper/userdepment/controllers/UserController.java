package com.devsuper.userdepment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuper.userdepment.entities.user;
import com.devsuper.userdepment.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<user> findAll() {
		List<user>result = repository.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{id}")
	public user findById(@PathVariable Long id) {
		user result = repository.findById(id).get();
		return result;
	
	}


	@PostMapping
	public user insert(@RequestBody user user) {
		user result = repository.save(user);
		return result;


	}
}