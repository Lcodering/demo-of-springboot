package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.UserProperties;

/**
 * 
 * @author william_lee
 * @date 2019年1月20日
 */
@RestController
public class HelloController {
	
	@Autowired
	private UserProperties userProperties;
	
	@RequestMapping("/hello")
	public String hello(){
		return userProperties.getName()+","+userProperties.getAge();
	}

}
