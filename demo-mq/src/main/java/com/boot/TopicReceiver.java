package com.boot;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.stereotype.Component;

@Component
@RabbitListeners(@RabbitListener(queues = {"topic.message","topic.messages"}))
//@RabbitListeners({@RabbitListener(queues = "topic.message"), @RabbitListener(queues = "topic.messages")})
public class TopicReceiver {
	@RabbitHandler
	public void process1(User user) {
		System.out.println("process1:" + user.toString());
	}
	//
	//@RabbitHandler
	//public void process2(User user) {
	//	System.out.println("process2:" +user.toString());
	//}
}
