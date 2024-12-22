package in.ashokit.CloudConfigServer.indexcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
	
	
	@GetMapping("/")
	public String getMsg(){
		return "hello";
	}

}
