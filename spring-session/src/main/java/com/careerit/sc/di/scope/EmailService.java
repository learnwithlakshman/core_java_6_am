package com.careerit.sc.di.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class EmailService {

        public void greet(String user){
              String.format("Hi %s,\n Welcome to Spring World");
        }
}
