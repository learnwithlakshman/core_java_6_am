package com.careerit.sc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailClient {

  private SpellCheckService spellCheckService;

  @Autowired
  public EmailClient(SpellCheckService spellCheckService){
      this.spellCheckService = spellCheckService;
  }

  public void sendEmail(String email, String body) {
    System.out.println("Email send method is called");
    spellCheckService.spellCheck(body);
    System.out.println("Email sent...");
  }
}
