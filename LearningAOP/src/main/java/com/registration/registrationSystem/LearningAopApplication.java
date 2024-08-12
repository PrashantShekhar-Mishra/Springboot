package com.registration.registrationSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan("com.registration.registrationSystem")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class LearningAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningAopApplication.class, args);
	}

}
