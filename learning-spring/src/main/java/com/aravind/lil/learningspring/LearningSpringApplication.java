package com.aravind.lil.learningspring;

import com.aravind.lil.learningspring.sub1.SpringComponent1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext appContext = SpringApplication.run(LearningSpringApplication.class, args);
		SpringComponent1 component1 = appContext.getBean(SpringComponent1.class);
		System.out.println("Component output: " + component1.getMessage());
	}

}
