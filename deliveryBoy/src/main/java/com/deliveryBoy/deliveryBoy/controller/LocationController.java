package com.deliveryBoy.deliveryBoy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryBoy.deliveryBoy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){

		for(int i=0; i<=1000;i++) {
			this.kafkaService.updateLocation("( "+ Math.round(Math.random()*100) + " "+ Math.round(Math.random()*100) + " " +")");
			System.out.println("message produced" +i);
			System.out.println("______________________________________________");
		}
		
		return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
		
	}
}
