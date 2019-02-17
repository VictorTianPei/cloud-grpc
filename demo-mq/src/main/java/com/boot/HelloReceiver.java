package com.boot;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

	@RabbitHandler
	@Async
	public void process(String hello) {
		System.out.println("Receiver1  : " + hello +"--------------" + Thread.currentThread().getName());
	}

}
