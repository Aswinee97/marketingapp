package com.marketingapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class EmailServiceImpl implements EmailService {
		
	@Autowired
	private JavaMailSender mailSend;
	
	@Override
	public void sendSimpleMail(String to, String Subject, String emailBody) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(Subject);
		message.setText(emailBody);
		mailSend.send(message);
	}
	

	
}
