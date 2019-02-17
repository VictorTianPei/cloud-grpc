package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private  Consumer1 consumer1;

	@Bean
	public CommandLineRunner asyncDemo() {
		return args -> {
			System.out.println("--------------------------------+++++++++++++++++++++++++++++++++++++++++++++++++");
			consumer1.test("00000000000000000");
			System.out.println("--------------------------------+++++++++++++++++++++++++++++++++++++++++++++++++");
		};
	}
}
