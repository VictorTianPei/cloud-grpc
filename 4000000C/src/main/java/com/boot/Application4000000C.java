package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer //开启配置服务
@SpringBootApplication
@EnableDiscoveryClient
public class Application4000000C {

	public static void main(String[] args) {
		SpringApplication.run(Application4000000C.class, args);
	}

}
