package com.careerit.sc.di.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class UserSeedData  {


  public void service() {

  }

  @PreDestroy
  public void destroy() throws Exception {
    System.out.println("destroy");
  }

  @PostConstruct
  public void init() throws Exception {
    System.out.println("init");
  }
}
