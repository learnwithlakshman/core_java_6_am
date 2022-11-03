package com.careerit.ems.service;

import com.careerit.ems.dao.EmployeeDao;
import com.careerit.ems.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

  public static final String EMPLOYEE_NUMBER_REQUIRED = "Employee number can't <= 0";
  @Autowired
  private EmployeeDao employeeDao;

  @Override
  public List<Employee> getEmployees() {
    List<Employee> empList = employeeDao.getEmployees();
    log.info("Employee count is :{}", empList.size());
    return empList;
  }

  @Override
  public Employee addEmployee(Employee employee) {
    Assert.hasText(employee.getEname(), "Employee name can't be null or empty");
    Assert.isTrue((employee.getDeptno() != null || employee.getDeptno() != 0), "Department number can't null or zero");
    Employee emp = employeeDao.addEmployee(employee);
    log.info("Employee is added with id {}", emp.getEmpno());
    return emp;
  }

  @Override
  public Employee updateEmployee(Employee employee) {
    Assert.isTrue(employee.getEmpno()<=0, EMPLOYEE_NUMBER_REQUIRED);
    Assert.hasText(employee.getEname(), "Employee name can't be null or empty");
    Assert.isTrue((employee.getDeptno() != null || employee.getDeptno() != 0), "Department number can't null or zero");
    Employee updatedEmp = employeeDao.updateEmployee(employee);
    log.info("Employee details updated");
    return updatedEmp;
  }

  @Override
  public boolean deleteEmployee(int empno) {
    Assert.isTrue(empno>=0,EMPLOYEE_NUMBER_REQUIRED);
    return employeeDao.deleteEmployee(empno);
  }

  @Override
  public Employee getEmployeeById(int empno) {
    Assert.isTrue(empno>=0,EMPLOYEE_NUMBER_REQUIRED);
    return employeeDao.findById(empno);
  }

  @Override
  public List<Employee> search(String str) {
    Assert.notNull(str, "Search string can't be null or empty");
    List<Employee> list = employeeDao.search(str);
    log.info("Total {} employee found for given search string {}", list.size(), str);
    return list;
  }

  @Override
  public List<Employee> getEmployeesByDeptno(int deptno) {
    return Collections.emptyList();
  }

  @Override
  public List<Employee> addEmployees(List<Employee> list) {
    return Collections.emptyList();
  }
}
