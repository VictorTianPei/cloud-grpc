package com.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	private ServiceClient serviceClient;

	@RequestMapping("/test")
	public String test(){
		return serviceClient.printf();
	}

	@RequestMapping("/test1")
	@HystrixCommand(fallbackMethod = "findByIdFallback")
	public String test1(){
		return serviceClient.printf();
	}
	public String findByIdFallback() {
		return "fall";
	}
}
