package com.leo.springcloud.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.springcloud.dao.UserDao;
import com.leo.springcloud.entity.User;
import com.leo.springcloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserHystrixServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean add(User u) {
		// TODO Auto-generated method stub
		return userDao.addUser(u);
	}

	@Override
	@HystrixCommand(fallbackMethod = "getfallback") // 定义 FallBack
	public User get(int id) {
		// TODO Auto-generated method stub
		User u = userDao.findById(id);
		if (u == null) {
			throw new RuntimeException();
		}
		return u;
	}
	
	public User getfallback(int id) {
		return new User(-1, "null", "null");
	}

	@Override
	@HystrixCommand(fallbackMethod = "listfallback")
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	
	public List<User> listfallback() {
		return Arrays.asList(new User(-1, "null", "null"));
	}

}
