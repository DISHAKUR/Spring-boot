package com.disha.student.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {

    @Autowired		
	private JavaMailSenderImpl sender;
	
	@Override
	public void sendEmail(String toAddress, String subject, String body) {
		
		MimeMessage createMimeMessage = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(createMimeMessage);
		try {
			helper.setTo(toAddress);
			helper.setSubject(subject);
			helper.setText(body);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sender.send(createMimeMessage);

	}

}
