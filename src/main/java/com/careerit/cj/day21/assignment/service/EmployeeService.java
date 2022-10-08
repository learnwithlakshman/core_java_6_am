package com.careerit.cj.day21.assignment.service;

import com.careerit.cj.day21.assignment.domain.Employee;
import com.careerit.cj.day21.assignment.dto.DepartmentStatsDTO;
import com.careerit.cj.day21.assignment.dto.EmployeeBasicInfoDTO;

import java.util.List;
import java.util.Set;

public interface EmployeeService {

      public List<Employee> getEmployeesByLocation(String location);
      public double totalSalary(int deptno);
      public List<DepartmentStatsDTO> getDepartmentsStats();
      public Set<String> getEmployeeNames();
      public List<EmployeeBasicInfoDTO> getEmployeeBasicDetails();
      public Set<String> getDepartmentNames();

}
