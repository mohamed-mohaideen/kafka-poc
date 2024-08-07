package com.msoft.kafka.subscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberApplication.class, args);
	}
	
	@KafkaListener(id = "user", topics = {"welcome", "message", "thank"})
	public void listener(String info) {
		System.out.println("##########Message############");
		System.out.println(info);
	}

}
