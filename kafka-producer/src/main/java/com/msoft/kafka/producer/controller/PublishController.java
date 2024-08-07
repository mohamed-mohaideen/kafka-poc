package com.msoft.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PublishController {
	
	@Autowired
	private KafkaTemplate<String, String> template;
	

	@PostMapping("/create/{type}")
	public void publishData(
			@PathVariable("type") String type, @RequestBody String info) {
		switch(type) {
		case "greeting" -> template.send("welcome", info);
		case "message" -> template.send(type, info);
		case "bye" -> template.send("thank", info);		
		}
	}
}
