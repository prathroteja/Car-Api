package in.jam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(GreetApi1Application.class, args);
	}

}
