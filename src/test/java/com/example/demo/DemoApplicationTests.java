package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
public class DemoApplicationTests {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args);

	}

	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello World !!");

	}

}
