package com.leo.springcloud.service;

import java.util.List;

import com.leo.springcloud.entity.User;


public interface UserService {

	public boolean add(User u);

	public User get(int id);

	public List<User> list();
	
}
