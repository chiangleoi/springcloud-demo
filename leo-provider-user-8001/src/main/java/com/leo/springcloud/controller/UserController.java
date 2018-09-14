package com.leo.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leo.springcloud.entity.User;
import com.leo.springcloud.service.UserService;

@RestController
public class UserController {
	
	@Resource
	private UserService userServiceImpl;
	
	@GetMapping("/users")
	public List<User> users() {
		return userServiceImpl.list();
	}
	
	@GetMapping("/user/{id}")
	public User user(@PathVariable int id) {
		return userServiceImpl.get(id);
	}
	
}
