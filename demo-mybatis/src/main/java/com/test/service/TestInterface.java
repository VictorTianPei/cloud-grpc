package com.test.service;

import com.test.TestSource;

public interface TestInterface {

	@TestSource
	String test(String name) throws Exception;
}
