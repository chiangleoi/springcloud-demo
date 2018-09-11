package com.leo.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.leo.springcloud.entity.User;

@Mapper
public interface UserDao {
	
	public boolean addUser(User u);

	public User findById(int id);

	public List<User> findAll();
	
}
