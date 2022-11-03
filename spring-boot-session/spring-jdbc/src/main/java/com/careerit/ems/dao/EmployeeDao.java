package com.careerit.ems.dao;

import com.careerit.ems.domain.Employee;

import java.util.List;

public interface EmployeeDao {

      List<Employee> getEmployees();
      Employee addEmployee(Employee employee);
      Employee updateEmployee(Employee employee);
      boolean deleteEmployee(int empno);
      Employee findById(int empno);
      List<Employee> search(String str);
      List<Employee> findByDeptno(int deptno);
      List<Employee> addEmployees(List<Employee> list);

}
