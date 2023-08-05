package com.finalproject.springlogelk;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controller {
	Logger log=LoggerFactory.getLogger(Controller.class);
	@GetMapping("/")
	public String Home() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome Home" + localDateTime);
		return "Welcome"; 
	}
	
	@GetMapping("/logs")
	public String logsPage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome to Logs Page" + localDateTime);
		return "This is Log Page"; 
	}
}
