package com.ashok.greet.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ashokit")
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg();

}
