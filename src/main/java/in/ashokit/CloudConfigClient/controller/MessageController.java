package in.ashokit.CloudConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@Value("${msg}")
	private String messsage;
	
	@GetMapping("/")
	public String getMsg() {
		return messsage;
	}
	
	
	@GetMapping("/welcome/{profile}")
	public String getMsg(@PathVariable String profile) {
		return messsage;
	}


}
