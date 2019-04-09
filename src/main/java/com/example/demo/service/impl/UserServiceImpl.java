package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	

	@Override
	public User checkUserByName(String username) throws Exception {
		
		return userMapper.checkUserByName(username);
	}



	@Override
	public void addUser(User user) throws Exception {
		userMapper.addUser(user);
		
	}

}
