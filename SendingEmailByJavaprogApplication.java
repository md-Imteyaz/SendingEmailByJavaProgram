package com.sendingemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.sendingemail.service.EmailSenderService;

@SpringBootApplication
public class SendingEmailByJavaprogApplication {

	@Autowired
	private EmailSenderService emailsenderservice;

	public static void main(String[] args) {
		SpringApplication.run(SendingEmailByJavaprogApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)

	public void sendemail() {
		emailsenderservice.sendemail("imteyazmd143@gmail.com", "Sending email from java program.", "with due respect i want to inform you that i have completed my task.");
	}

}
