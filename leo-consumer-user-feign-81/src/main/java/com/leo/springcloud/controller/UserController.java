package com.leo.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leo.springcloud.entity.User;
import com.leo.springcloud.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> Users () {
		return userService.list();
	}
	
	@GetMapping("/user/{id}")
	public User User(@PathVariable int id) {
		return userService.get(id);
	}

}
