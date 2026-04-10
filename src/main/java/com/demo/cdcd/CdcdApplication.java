package com.demo.cdcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CdcdApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to CI CD Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(CdcdApplication.class, args);
	}

}
