package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

	private String topic="demodata";

	@Autowired                    //topic   msgformat  
	private KafkaTemplate<String,Object> temp;
	
	//how to publish a string data
	@GetMapping("/publish/{msg}")
	public String publishMessage(@PathVariable String msg) {
		temp.send(topic,"Hi! welcome "+msg);
		return "data is published";
	}
	
	//how to publish json data
	
	@GetMapping("/json")
	public String publishJsonMessage() {
		User user=new User(1,"karthik");
		temp.send(topic,user);
		return "json data published";
	}
	
}


