package com.basic_example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello()
	{
		return "Welcome to the world of SPRING BOOT!";
	}

}
