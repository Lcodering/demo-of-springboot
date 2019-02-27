package com.example.demo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.SpringbootProjectApplicationTests;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;

import junit.framework.Assert;

public class UserTest extends SpringbootProjectApplicationTests{

	@Autowired
	private UserService userServiceImpl;
	
	@Test
	public void testCheckUserByName() throws Exception{
		
		User user = userServiceImpl.checkUserByName("william");
		
		System.out.println(user);
		
	}
	
	
	
	

}
