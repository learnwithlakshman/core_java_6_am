package com.careerit.ems.dao;

import com.careerit.ems.dao.mapper.EmployeeRowMapper;
import com.careerit.ems.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
@Slf4j
public class EmployeeDaoImpl implements EmployeeDao {

  private static final String ADD_EMP = "insert into employee(ename,salary,deptno) values(?,?,?)";
  private static final String GET_EMPLOYEES = "select empno,ename,salary,deptno from employee";

  private static final String GET_EMP_BY_ID = "select empno,ename,salary,deptno from employee where empno=?";

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public List<Employee> getEmployees() {
    List<Employee> list = jdbcTemplate.query(GET_EMPLOYEES, new EmployeeRowMapper());
    log.info("Employee count :{}", list.size());
    return list;
  }

  @Override
  @Transactional
  public Employee addEmployee(Employee employee) {
    KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(con -> {
      PreparedStatement ps = con.prepareStatement(ADD_EMP, new String[]{"empno"});
      ps.setString(1, employee.getEname());
      ps.setFloat(2, employee.getSalary());
      ps.setLong(3, employee.getDeptno());
      return ps;
    }, keyHolder);
    int empno = (int) keyHolder.getKey();
    employee.setEmpno(empno);
    log.info("Employee {} is added with id {}", employee.getEname(), employee.getEmpno());
    return employee;
  }

  @Override
  public Employee findById(int empno) {
    return jdbcTemplate.query(con -> {
      PreparedStatement ps = con.prepareStatement(GET_EMP_BY_ID);
      ps.setInt(1, empno);
      return ps;
    }, new EmployeeRowMapper()).get(0);
  }

  @Override
  public Employee updateEmployee(Employee employee) {
        jdbcTemplate.update(con -> {
              PreparedStatement ps = con.prepareStatement("update employee ename=?, salary=?,deptno = ? where empno=?");
              ps.setString(1,employee.getEname());
              ps.setFloat(2,employee.getSalary());
              ps.setLong(3,employee.getDeptno());
              ps.setInt(4,employee.getEmpno());
              return ps;
        });
        return employee;
  }

  @Override
  public boolean deleteEmployee(int empno) {
    int count = jdbcTemplate.update(con -> {
      PreparedStatement ps = con.prepareStatement("delete from employee where empno=?");
      ps.setInt(1,empno);
      return ps;
    });
    return count!=0;
  }


  @Override
  public List<Employee> search(String str) {
    return  jdbcTemplate.query(con -> {
      PreparedStatement ps = con.prepareStatement("select empno,ename,salary,deptno from employee where lower(ename) like ?");
      ps.setString(1,"%"+str.toLowerCase()+"%");
      return ps;
    },new EmployeeRowMapper());
  }

  @Override
  public List<Employee> findByDeptno(int deptno) {
    return  jdbcTemplate.query(new PreparedStatementCreator() {
      @Override
      public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
            PreparedStatement ps = con.prepareStatement("select empno,ename,salary,deptno from employee where deptno=?");
            ps.setInt(1,deptno);
            return ps;
      }
    },new EmployeeRowMapper());
  }

  @Override
  @Transactional
  public List<Employee> addEmployees(List<Employee> list) {
     jdbcTemplate.batchUpdate(ADD_EMP, list, 50, (ps, employee) -> {
      ps.setString(1, employee.getEname());
      ps.setFloat(2, employee.getSalary());
      ps.setLong(3, employee.getDeptno());
    });
    return list;
  }
}
