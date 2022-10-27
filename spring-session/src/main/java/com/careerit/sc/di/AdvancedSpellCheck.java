package com.careerit.sc.di;

import org.springframework.stereotype.Component;

@Component
public class AdvancedSpellCheck implements SpellCheckService{
  public void spellCheck(String body) {
    System.out.println("Advanced spell check run");
  }
}
