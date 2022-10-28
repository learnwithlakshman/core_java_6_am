package com.careerit.sc.di.ems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "com.careerit.sc.di")
public class Manager {
  public static void main(String[] args) {
    //ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
    EmployeeService employeeService = context.getBean(EmployeeService.class);
    employeeService.sendEmail("krish.t@gmail.com");

  }
}
