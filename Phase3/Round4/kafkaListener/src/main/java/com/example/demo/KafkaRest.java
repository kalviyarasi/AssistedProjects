package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRest {
List<String> msg=new ArrayList<>();
@GetMapping("/consumestringmsg")
	public List<String> consumeMsg(){
		return msg;
	}

@KafkaListener(groupId = "group1",topics = "demodata",containerFactory ="stringlistener" )
public List<String> getMsgFromTopic(String data){
	msg.add(data);
	return msg;
}


User userdata=null;
@GetMapping("/consumejsonmsg")
public User consumeJsonMsg(){
	System.out.println("in json"+userdata);
	return userdata;
}

@KafkaListener(groupId = "group2",topics = "demodata",containerFactory ="objectlistener" )
public User getJsonMsgFromTopic(User user){
	System.out.println("in listener"+user);
	userdata=user;
	return userdata;
}


}

