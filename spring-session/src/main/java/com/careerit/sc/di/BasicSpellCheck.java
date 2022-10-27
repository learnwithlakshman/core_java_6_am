package com.careerit.sc.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasicSpellCheck implements SpellCheckService {

      public void spellCheck(String body){
        System.out.println("Basic spell check run");
      }

}
