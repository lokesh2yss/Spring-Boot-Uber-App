package com.codingshuttle.project.uber.uberApp;

import com.codingshuttle.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {
	@Autowired
	private EmailSenderService emailSenderService;
	@Test
	void contextLoads() {
		emailSenderService.sendEmail("kokogog633@hapied.com", "Hello Lokesh", "Hellolokefkeof");
	}

	@Test
	void sendEmailMultiple() {
		String[] emails = {"kokogog633@hapied.com", "lokesh2.yss@gmail.com"};
		emailSenderService.sendEmail(emails, "Hello Lokesh", "Hellolokefkeof");
	}

}
