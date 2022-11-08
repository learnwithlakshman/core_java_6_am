package com.carrerit.iplstats;

import com.carrerit.iplstats.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class IplstatApplication implements CommandLineRunner {

  @Value("${app.message}")
  private String message;

  @Autowired
  private EmailService emailService;

  public static void main(String[] args) {
    SpringApplication.run(IplstatApplication.class,args);
  }

  @Override
  public void run(String... args) {
        emailService.sendEmail("hemalatha542@gmail.com","Greeting from Spring Boot World","Hi, Learning spring boot is fun!, lets have fun");
  }
}
