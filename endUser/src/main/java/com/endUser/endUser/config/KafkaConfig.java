package com.endUser.endUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.endUser.endUser.AppConstants;

@Configuration
public class KafkaConfig{
	
	@KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME , groupId = AppConstants.GROUP_ID)
	public void updatedLocation(String value) {
		
		System.out.println("location is : "+value);
		
	}

}
