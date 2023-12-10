package com.aravind.deploy.samplewarproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleWarProjectApplication {

	@GetMapping("/health")
	public String healthCheck(){
		return "Health Ok !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleWarProjectApplication.class, args);
	}
}
