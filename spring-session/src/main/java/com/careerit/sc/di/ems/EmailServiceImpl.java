package com.careerit.sc.di.ems;

import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
  @Override
  public void sendEmail(String email, String body) {
    System.out.println(String.format("Email is send to :%s, with body :%s", email, body));
  }
}
