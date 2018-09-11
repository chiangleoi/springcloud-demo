package com.leo.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.springcloud.dao.UserDao;
import com.leo.springcloud.entity.User;
import com.leo.springcloud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean add(User u) {
		// TODO Auto-generated method stub
		return userDao.addUser(u);
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
