package com.msoft.kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MessageTopic {
	
	@Bean
	public NewTopic greeting() {
		return TopicBuilder.name("welcome").build();
	}
	
	@Bean
	public NewTopic message() {
		return TopicBuilder.name("message").build();
	}
	
	@Bean
	public NewTopic bye() {
		return TopicBuilder.name("thank").build();
	}

}
