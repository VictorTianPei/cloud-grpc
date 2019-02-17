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
	private HelloSender helloSender;

	@Bean
	public CommandLineRunner demo() {
		return args -> {
			for (int i = 0; i < 10; i++) {

				User user1 = new User("name1", "password1");
				User user2 = new User("name2", "password2");
				helloSender.send1(user1);
				helloSender.send2(user2);
				//helloSender.send();
			}
		};
	}
}
