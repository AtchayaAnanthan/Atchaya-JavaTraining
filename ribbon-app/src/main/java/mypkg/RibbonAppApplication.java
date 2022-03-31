package mypkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class RibbonAppApplication {
	
	
	
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/app")
	public String getPortNumber() {
		//return port;
		return "My second service is in port number"+port;
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonAppApplication.class, args);
	}

}