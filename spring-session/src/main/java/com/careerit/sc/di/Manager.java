package com.careerit.sc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages ="com.careerit.sc.di")
public class Manager {
  public static void main(String[] args) {
        //EmailClient obj = new EmailClient(new AdvancedSpellCheck());

    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);  //new ClassPathXmlApplicationContext("spring-core.xml");
    EmailClient obj1 = context.getBean("emailClient", EmailClient.class);
    obj1.sendEmail("info@info.com","Greeting from info.com");
  }
}
