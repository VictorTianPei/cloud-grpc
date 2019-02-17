package com.boot;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	@Bean
	public Queue Queue() {
		return new Queue("hello");
	}

	//@Bean(name = "helloRabbitListenerContainer")
	//public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory, MessageConverter messageConverter) {
	//	SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
	//	factory.setMessageConverter(messageConverter);
	//	factory.setConnectionFactory(connectionFactory);
	//	return factory;
	//}
	//
	//@Bean
	//public MessageConverter jsonMessageConverter(){
	//	return new Jackson2JsonMessageConverter();
	//}

}
