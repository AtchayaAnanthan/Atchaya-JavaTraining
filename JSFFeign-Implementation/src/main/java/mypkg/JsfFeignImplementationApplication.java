package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JsfFeignImplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsfFeignImplementationApplication.class, args);
	}

}
