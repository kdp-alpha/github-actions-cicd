package com.demo.cdcd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CdcdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void welcomeMessageShouldMatch() {
		CdcdApplication app = new CdcdApplication();
		assertEquals("Welcome to CI CD Application", app.welcome());
	}

}
