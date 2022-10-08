package com.careerit.cj.day21.assignment.service;

import com.careerit.cj.day21.assignment.domain.Department;
import com.careerit.cj.day21.assignment.domain.Employee;
import com.careerit.cj.day21.assignment.dto.DepartmentStatsDTO;
import com.careerit.cj.day21.assignment.dto.EmployeeBasicInfoDTO;
import com.careerit.cj.day21.assignment.util.CsvReaderUtil;

import java.util.List;
import java.util.Set;

public class EmployeeServiceImpl implements  EmployeeService {

  private List<Employee> empList;
  private List<Department> deptList;

  public EmployeeServiceImpl() {
      empList = CsvReaderUtil.loadEmployees();
      deptList = CsvReaderUtil.loadDepartments();
  }

  @Override
  public List<Employee> getEmployeesByLocation(String location) {
    return null;
  }

  @Override
  public double totalSalary(int deptno) {
    return 0;

  }

  @Override
  public List<DepartmentStatsDTO> getDepartmentsStats() {
    return null;
  }

  @Override
  public Set<String> getEmployeeNames() {
    return null;
  }

  @Override
  public List<EmployeeBasicInfoDTO> getEmployeeBasicDetails() {
    return null;
  }

  @Override
  public Set<String> getDepartmentNames() {
    return null;
  }
}
