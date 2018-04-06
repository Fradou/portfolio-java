package com.alexandrefradet.resume.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MailServiceImpl implements MailService {

    @Autowired
    public JavaMailSender emailSender;
    
    @Value("${mail.sender}")
    public String emailFrom;
    
    /**
     * Basic email sender
     * @param to
     * @param subject
     * @param text
     */
    public void sendSimpleMessage(String to, String subject, String text) {
        
    	SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(to);
        message.setFrom(emailFrom);
        message.setSubject(subject); 
        message.setText(text);
        try {
        	emailSender.send(message);
        }
        catch(MailException ex) {
        	log.error("Erreur rencontrée lors de la tentative d'envoi de mail :", ex);
        }
    }
}
