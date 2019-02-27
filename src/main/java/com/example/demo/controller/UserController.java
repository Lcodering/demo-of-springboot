package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Message;

/**
 * 
 * @author william_lee
 * @date 2019年2月8日
 * 	前端的控制器
 */

@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userServiceImpl;
	

	@RequestMapping(path="/nameCheck" ,method=RequestMethod.POST)
	public Object selectUserByName(@RequestBody String Username) {
		
		
		logger.info("start the function of selectUserByName");
		Message<String> msg = null;
		
		try {
			User user = userServiceImpl.checkUserByName(Username);
			if(user == null){
				 msg = new Message<String>("success", 200, null);
				 return msg;
			}else {
				msg = new Message<String>("fail", 200, null);
				return msg;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return null;
	}
	
	@RequestMapping(path="/register" ,method=RequestMethod.POST)
	public Object registery(@RequestBody User user) {
		
		
		return null;
	}
	
	

}
