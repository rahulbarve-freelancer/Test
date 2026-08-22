package spring.rest.git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

	@GetMapping("/greet")
	public String doGreet() {
		return "Welcome to Spring REST with Git thank you";
	}
}
