package raisetech.Student.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/cat")
public class Application {

public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/asa")
	public String asa(){
		return "##GoodMorning##";
	}
}
