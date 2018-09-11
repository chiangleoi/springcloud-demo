package com.leo.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.leo.springcloud.entity.User;

@RestController
public class UserController {
	
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-USER";
	
	@Autowired
	RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/users")
	public List<User> Users (){
		return restTemplate.getForObject(REST_URL_PREFIX + "/users", List.class);
	}
	
	@GetMapping("/user/{id}")
	public User User(@PathVariable int id){
		return restTemplate.getForObject(REST_URL_PREFIX + "/user/" + id, User.class);
	}

}
