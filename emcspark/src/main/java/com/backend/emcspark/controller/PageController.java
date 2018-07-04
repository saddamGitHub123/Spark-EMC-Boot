package com.backend.emcspark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.restbackend.App;

@RestController
@RequestMapping("/page")
public class PageController {

	@GetMapping("/welcome")
	public String welComeSpark() {
		return " WelCome to Spark Spring boot project";
	}
	
	@GetMapping("/api/test")
	public String getValueFromBackend() {
		
		App app = new App();
		String mesg = app.testBackEnd();
		
		return mesg;
	}
}
