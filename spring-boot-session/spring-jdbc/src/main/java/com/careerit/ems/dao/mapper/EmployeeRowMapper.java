package com.careerit.ems.dao.mapper;

import com.careerit.ems.domain.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
  @Override
  public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
         Employee emp = new Employee();
         emp.setSalary(rs.getFloat("salary"));
         emp.setEname(rs.getString("ename"));
         emp.setEmpno(rs.getInt("empno"));
         emp.setDeptno(rs.getLong("deptno"));
         return emp;
  }
}
