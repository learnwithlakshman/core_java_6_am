package com.careerit.cj.day21.assignment.util;

import com.careerit.cj.day18.quiz.Question;
import com.careerit.cj.day21.assignment.domain.Department;
import com.careerit.cj.day21.assignment.domain.Employee;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderUtil {
  private static final String EMP_FILE = "/emp.csv";
  private static final String DEPT_FILE = "/dept.csv";

  public static List<Employee> loadEmployees() {
    List<Employee> employees = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Path.of(CsvReaderUtil.class.getResource(EMP_FILE).toURI()));
      lines.stream().skip(1).forEach(ele -> {
        String[] arr = ele.split(",");
        Long id = Long.parseLong(arr[0]);
        String name = arr[1];
        double salary = Double.parseDouble(arr[2]);
        LocalDate doj = LocalDate.parse(arr[3]);
        int deptno = Integer.parseInt(arr[4]);
        Employee emp = new Employee();
        emp.setDeptno(deptno);
        emp.setName(name);
        emp.setDoj(doj);
        emp.setSalary(salary);
        emp.setDeptno(deptno);
        employees.add(emp);
      });
    } catch (Exception e) {
      System.out.println("While reading the file :" + e);
    }
    return employees;
  }

  public static List<Department> loadDepartments() {
    //Logic
    return null;
  }
}
