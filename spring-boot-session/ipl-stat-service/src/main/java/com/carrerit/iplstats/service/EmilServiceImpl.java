package com.carrerit.iplstats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class EmilServiceImpl implements  EmailService {

  @Autowired
  private JavaMailSender emailSender;

  @Override
  public void sendEmail(String to, String subject, String body) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(to);
    message.setSubject(subject);
    message.setText(body);
    emailSender.send(message);
  }

  @Override
  public void sendEmail(String to, String subject, String body,  String filePath) {
    MimeMessagePreparator preparator = mimeMessage -> {
      MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
      message.setTo(to);
      message.setFrom(new InternetAddress("learnwithlakshman@gmail.com"));
      message.setSubject(subject);
      message.setText(body);
      FileSystemResource attachment = new FileSystemResource(new File(filePath));
      message.addAttachment(attachment.getFilename(), attachment);
    };
    try {
      emailSender.send(preparator);
    }
    catch (MailException ex) {
      ex.printStackTrace();
      System.err.println(ex.getMessage());
    }
  }



}
