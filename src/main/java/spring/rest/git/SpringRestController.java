package spring.rest.git;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
	
	@GetMapping("/greet")
	public String doGreet() {
		return "Welcome to Spring REST using Spring Boot and Jenkins";
	}
	@GetMapping("/allNames")
	public List<Name> getAllNames(){
		return NameStore.getAllNames();		
	}
}

