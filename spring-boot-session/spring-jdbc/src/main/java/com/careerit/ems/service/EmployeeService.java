package com.careerit.ems.service;

import com.careerit.ems.domain.Employee;

import java.util.List;

public interface EmployeeService {

  List<Employee> getEmployees();

  Employee addEmployee(Employee employee);

  Employee updateEmployee(Employee employee);

  boolean deleteEmployee(int empno);

  Employee getEmployeeById(int empno);

  List<Employee> search(String str);

  List<Employee> getEmployeesByDeptno(int deptno);

  List<Employee> addEmployees(List<Employee> list);
}
