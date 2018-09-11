package com.leo.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.leo.springcloud.entity.User;
import com.leo.springcloud.fallback.UserServiceFallbackFactory;

// Feign 客户端, value = Server
@FeignClient(value = "MICROSERVICECLOUD-USER", fallbackFactory=UserServiceFallbackFactory.class) 
public interface UserService {
	
	@GetMapping("/users")
	public List<User> list();
	
	@GetMapping("/user/{id}")
	public User get(@PathVariable(value = "id") int id);
}
