package com.basic_example.helloworldexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldExampleApplication.class, args);
		System.out.println("Hello World");
	}

}
