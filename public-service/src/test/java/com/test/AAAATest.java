package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AAAATest {

	@Test
	public void test(){
		System.out.println("dddddddddddd");
	}
	@Before
	public void init() {
		System.out.println("开始测试-----------------");
	}

	@After
	public void after() {
		System.out.println("测试结束-----------------");
	}
}
