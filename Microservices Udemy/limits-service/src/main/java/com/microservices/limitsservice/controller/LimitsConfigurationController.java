package com.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.configuration.Configuration;
import com.microservices.limitsservice.model.LimtConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration; 
	
	@GetMapping("/limits")
	public LimtConfiguration retriveLimitsFromConfiguration() {
		return new LimtConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
}