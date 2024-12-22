package __welcome_api.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

@EnableDiscoveryClient
public class AshokitApplication {

	public static void main(String[] args) {
		SpringApplication.run(AshokitApplication.class, args);
	}

}
