package com.careerit.email;

import com.careerit.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringUtilApplication implements CommandLineRunner {
  @Autowired
  private EmailService emailService;
  public static void main(String[] args) {
    SpringApplication.run(SpringUtilApplication.class,args);
  }

  @Override
  public void run(String... args) throws Exception {
        emailService.sendSimpleMessage("lakshman.miani@gmail.com","Greetings","Welcome to Spring boot world");
  }
}
