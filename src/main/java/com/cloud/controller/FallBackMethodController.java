package com.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	private static final Logger logger = LoggerFactory.getLogger(FallBackMethodController.class);
	
	final String SERVICE_FAILD = "RMS Service is taking longer than Expected. Please try again later.";

	@GetMapping("/serviceFallBack")
	public String serviceFallBack() {
		logger.info("RMS Service FallBack, {}", SERVICE_FAILD);
		return SERVICE_FAILD;
	}

}
