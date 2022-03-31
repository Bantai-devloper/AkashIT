package com.javahungry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/")
	public String sayHello() {
		System.out.println("Added New Line ");
		System.out.println("Added Second Line ");
		return "Hello!! from Java Hungry";
	}

}
