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
		Name n1 = new Name("James","Gosling");
		Name n2 = new Name("Gavin","King");
		Name n3 = new Name("Rod","Johnson");
		Name n4 = new Name("Linus","Tolvald");
		Name n5 = new Name("Ryan","Dahl");
		return List.of(n1,n2,n3,n4,n5);
		
	}
}
record Name(String firstName, String lastName) {}
