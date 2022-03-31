package mypkg;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {
	
	

		@GetMapping("/product")
	public String product() {
		return "Welcome To product Page";
	}}
//@Bean
//@LoadBalanced
//public RestTemplate createResttemplate()
 //return new RestTemplate
