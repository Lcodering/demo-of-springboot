package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.User;

@Mapper
public interface UserMapper {
	
	public User checkUserByName(String username) throws Exception;

}
