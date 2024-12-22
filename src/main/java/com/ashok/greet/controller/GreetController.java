package com.ashok.greet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.greet.client.WelcomeFeignClient;

@RestController
public class GreetController {
	
	@Autowired
	private WelcomeFeignClient welcomeFeignClient;
	
	@GetMapping("/greet")
	public String greet() {
		String welcomeMsg=welcomeFeignClient.getWelcomeMsg();
		String greetMsg="Good Morning !!!";
		return greetMsg+welcomeMsg;
	}
	

}
