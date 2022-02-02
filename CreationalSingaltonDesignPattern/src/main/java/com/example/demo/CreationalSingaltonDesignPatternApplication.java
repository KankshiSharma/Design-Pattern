package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreationalSingaltonDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreationalSingaltonDesignPatternApplication.class, args);

		SingaltonClass instance = SingaltonClass.getInstance();
		System.out.println(instance);
		SingaltonClass secondInstance = SingaltonClass.getInstance();
		System.out.println(secondInstance);
		
		
		Runtime.getRuntime();
	}

}
