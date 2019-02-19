package com.test.service.impl;

import com.test.service.TestInterface;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements TestInterface {

	@Override
	//@TestSource
	public String test(String name) throws Exception {
		System.out.println("-------------执行中-------------------");
		//int mv = 1/0;
		return name;
	}
}
