package com.careerit.ems.dao;

import com.careerit.ems.domain.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
class EmployeeDaoTest {

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @BeforeEach
  public void init() {
    clearData();
  }

  @Test
  void getEmployees() {
    Employee employee = new Employee();
    employee.setDeptno(10);
    employee.setEname("Krish");
    employee.setSalary(120000);
    employeeDao.addEmployee(employee);
    List<Employee> list = employeeDao.getEmployees();
    Assertions.assertEquals(1, list.size());
  }

  @Test
  void addEmployee() {
    Employee employee = new Employee();
    employee.setDeptno(10);
    employee.setEname("Krish");
    employee.setSalary(120000);
    Employee retEmployee = employeeDao.addEmployee(employee);
    Assertions.assertNotEquals(0, retEmployee.getEmpno());
  }

  @Test
  void findByIdTest() {
    Employee employee = new Employee();
    employee.setDeptno(10);
    employee.setEname("Krish");
    employee.setSalary(120000);
    Employee retEmployee = employeeDao.addEmployee(employee);
    Employee emp = employeeDao.findById(retEmployee.getEmpno());
    Assertions.assertEquals("Krish", emp.getEname());
  }

  @Test
  void addEmployees() {
    List<Employee> empList = employeeList();
    List<Employee> savedEmpList = employeeDao.addEmployees(empList);
    Assertions.assertEquals(empList.size(),savedEmpList.size());
    savedEmpList.forEach(emp->{
      System.out.println(emp.getEmpno());
    });
  }

  private List<Employee> employeeList() {
    Employee employee1 = new Employee();
    employee1.setDeptno(10);
    employee1.setEname("Krish");
    employee1.setSalary(120000);

    Employee employee2 = new Employee();
    employee2.setDeptno(20);
    employee2.setEname("Manoj");
    employee2.setSalary(160000);

    Employee employee3 = new Employee();
    employee3.setDeptno(10);
    employee3.setEname("Sai");
    employee3.setSalary(40000);
    return List.of(employee1, employee2, employee3);
  }

  private void clearData() {
    jdbcTemplate.update("delete from employee");
  }
}
