package com.example.email;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailServiceApplication {


	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}


//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() {
//
//		service.sendSimpleEmail("eng.alirabee@gmail.com",
//				"This is Email Body with Attachment...",
//				"This email has attachment");
//
//
//	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		service.sendEmailWithAttachment("eng.alirabee@gmail.com",
				"This is Email Body with Attachment...",
				"This email has attachment",
				"C:\\Users\\Electronica Care\\Pictures\\Capture.PNG");


	}
}
