package com.careerit.sc.di.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.Map;

@ComponentScan(basePackages = "com.careerit.sc.di.scope")
public class Manager {
  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    EmailService emailService1 = context.getBean("emailService",EmailService.class);
    EmailService emailService2 = context.getBean("emailService",EmailService.class);
    System.out.println(emailService1);
    System.out.println(emailService2);

    UserDao obj1 = context.getBean("userDao",UserDao.class);
    UserDao obj2 = context.getBean("userDao",UserDao.class);

    System.out.println(obj1);
    System.out.println(obj2);


  }

  public static <T> T getObject(String name,Class<T> cls){
          Map<String,Object> map = getObjects();
          Object obj = map.get(name);
          return (T)obj;

  }
  public static Map<String,Object> getObjects(){
    Map<String,Object> map = new HashMap<>();
    map.put("emp",new Employee());
    map.put("user",new User());
    map.put("prod",new Product());
    return map;
  }
}
class Employee{
  @Override
  public String toString() {
    return "Employee";
  }
}
class User{
  @Override
  public String toString() {
    return "User";
  }
}
class Product{
  @Override
  public String toString() {
    return "Product";
  }
}
