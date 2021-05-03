package com.demo.batch.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinTomcatDeployApplication {

	public static void main(String[] args) {
		System.out.println("Hello Jenkin Tomcat Deployment");
		SpringApplication.run(JenkinTomcatDeployApplication.class, args);
	}
}
