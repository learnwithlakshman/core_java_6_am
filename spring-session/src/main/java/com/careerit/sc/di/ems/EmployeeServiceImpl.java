package com.careerit.sc.di.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

  @Autowired
  private  EmployeeDao employeeDao;
  @Autowired
  private  EmailService emailService;

  @Override
  public void sendEmail(String email) {
        String name = employeeDao.getEmpDetails(email);
        String body = String.format("Hello %s, Welcome to spring world!",name);
        emailService.sendEmail(email,body);
  }
}
