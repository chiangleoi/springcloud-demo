package com.leo.springcloud.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.leo.springcloud.entity.User;
import com.leo.springcloud.service.UserService;

import feign.hystrix.FallbackFactory;

@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService>{

	@Override
	public UserService create(Throwable arg0) {
		return new UserService() {
			
			@Override
			public List<User> list() {
				return Arrays.asList(new User(-1, "服务已经关闭", null));
			}
			
			@Override
			public User get(int id) {
				return new User(-1, "服务已经关闭", null);
			}
		};
	}
	
	
	
}
