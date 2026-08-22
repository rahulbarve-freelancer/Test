package spring.rest.git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

	@GetMapping("/greet")
	public String doGreet() {
		return "Welcome to the demo of Spring Boot Rest API with Jenkins";
	}
}
