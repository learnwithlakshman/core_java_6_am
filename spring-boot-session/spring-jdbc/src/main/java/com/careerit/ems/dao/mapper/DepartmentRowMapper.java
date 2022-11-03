package com.careerit.ems.dao.mapper;

import com.careerit.ems.domain.Department;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentRowMapper implements RowMapper<Department> {
  @Override
  public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
         Department dept = new Department();
         dept.setDeptno(rs.getLong("deptno"));
         dept.setDname(rs.getString("dname"));
         dept.setLocation(rs.getString("location"));
         return dept;
  }
}
