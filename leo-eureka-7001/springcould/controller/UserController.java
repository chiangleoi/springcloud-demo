package com.leo.springcould.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.leo.springcould.entity.User;

@RestController
public class UserController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/users")
	public List<User> Users (){
		return Arrays.asList(new User(0, "a", "b"));
	}

}
