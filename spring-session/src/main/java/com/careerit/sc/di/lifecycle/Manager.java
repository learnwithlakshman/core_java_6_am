package com.careerit.sc.di.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.careerit.sc.di.lifecycle")
public class Manager {
  public static void main(String[] args) {

    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    context.close();
  }
}
