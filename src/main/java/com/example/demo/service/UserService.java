package com.example.demo.service;


import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.User;

public interface UserService {
	
	@Transactional(readOnly=true)
	public User checkUserByName(String username) throws Exception;
	
	@Transactional
	public void addUser(User user) throws Exception;

}
