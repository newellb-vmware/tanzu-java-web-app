package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	public static String message = "Greetings from Teledyne + Tanzu!";

	@RequestMapping("/")
	public String index() {
		return message;
	}

}
