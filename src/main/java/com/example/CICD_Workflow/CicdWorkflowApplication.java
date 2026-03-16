package com.example.CICD_Workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdWorkflowApplication {

	@GetMapping("/welcome")
	public String welcomeMethod()
	{
		return "Welcome to CI/CD integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdWorkflowApplication.class, args);
	}
}
