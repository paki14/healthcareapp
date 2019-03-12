package com.example.demo.schedular;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.demo.model.CarePerson;

@Configuration
public class Schedular {
	@Autowired
	SimpMessagingTemplate template;
	@Scheduled(fixedDelay=3000)
	public void sehedulingUserTimeByPatient() {
		template.convertAndSend("/topic/hi", new CarePerson());
	}
//	public void sehedulingUserTimeByCare() {
//	@Scheduled(fixedDelay=3000)
//		template.convertAndSend("/topic/hi2", new Care());
//	}
//	@Scheduled(fixedRate=10000)
//	public void sehedulingUserTime() {
////		template.convertAndSend("/topic/hi2", new CarePerson());
//		template.convertAndSend("/topic/hi", getCarePerson(), CarePerson());
//	}

}