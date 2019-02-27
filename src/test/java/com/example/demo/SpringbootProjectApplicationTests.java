package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {SpringbootProjectApplication.class})
@WebAppConfiguration
public class SpringbootProjectApplicationTests {

	@Before
	public void init() {
		System.out.println("=============start testing============");
	}
	
	@After
	public void destory() {
		System.out.println("=============testing end============");
	}

}

