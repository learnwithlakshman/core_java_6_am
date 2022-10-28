package com.careerit.sc.di.ems;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements  EmployeeDao{
  @Override
  public String getEmpDetails(String email) {
    return "User";
  }
}
