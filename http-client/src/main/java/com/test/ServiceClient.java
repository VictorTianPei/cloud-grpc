package com.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
//@FeignClient(value = "say-hello")
@FeignClient(name = "xxxx", url = "http://localhost:8090/", configuration = Configuration2.class, fallback = ServiceClientFallback.class)
public interface ServiceClient {

	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	String printf();
}
