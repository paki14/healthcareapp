package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CarePerson;

@RestController
public class ConnectorController {
	private static final Logger log = LoggerFactory.getLogger(ConnectorController.class);

	@MessageMapping("/hello")
	@SendTo("/topic/hi")
	public CarePerson[] getCarePersonById(RestTemplate restTemplate) {
		CarePerson[] carePerson = restTemplate.getForObject("http://localhost:8001/websocket/carepation/pation/1",
				CarePerson[].class);
		log.info(carePerson.toString());
		return carePerson;
	}

	@MessageMapping("/hello2")
	@SendTo("/topic/hi2")
	public CarePerson[] getCarePerson(RestTemplate restTemplate) {
		CarePerson[] carePerson = restTemplate.getForObject("http://localhost:8001/websocket/carepation/1",
				CarePerson[].class);
		log.info(carePerson.toString());
		return carePerson;
	}
}
