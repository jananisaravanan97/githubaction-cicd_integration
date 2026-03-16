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


//	echo "# githubaction-cicd_integration" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/jananisaravanan97/githubaction-cicd_integration.git
//	git push -u origin main

}
