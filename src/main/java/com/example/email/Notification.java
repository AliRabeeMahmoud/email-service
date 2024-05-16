package com.example.email;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Notification {


    @Autowired
    private EmailService service;




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
