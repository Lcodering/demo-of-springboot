package com.example.demo.service;


import com.example.demo.bean.User;

public interface UserService {
	
	public User checkUserByName(String username) throws Exception;

}
