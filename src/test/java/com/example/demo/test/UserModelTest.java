package com.example.demo.test;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.demo.mapper.UserMapper;

public class UserModelTest {
	
	private InputStream is;
	private SqlSession sqlSession;
	private UserMapper userMapper;
	
	@Before
	public void init() throws Exception{ 
		//读取配置文件
		is = Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建sessionFactory工厂
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory sessionFactory = factoryBuilder.build(is);
		//生成sqlSession对象
		sqlSession = sessionFactory.openSession();
		//使用sqlSession获取UserMapper接口的代理对象
		userMapper = sqlSession.getMapper(UserMapper.class);
	}
	
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@After
	
	public void destory() throws Exception{
		
		is.close();
		sqlSession.close();
		
	}

}
