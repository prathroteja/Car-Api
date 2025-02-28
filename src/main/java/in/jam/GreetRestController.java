package in.jam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg="Devansh";
		return msg;
	}

}
