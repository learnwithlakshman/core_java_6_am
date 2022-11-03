package com.careerit.ems.dao;

import com.careerit.ems.dao.mapper.DepartmentRowMapper;
import com.careerit.ems.domain.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Slf4j
public class DepartmentDaoImpl implements DepartmentDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public List<Department> getDepartments() {
    List<Department> list = jdbcTemplate.query("select deptno,dname,location from department", new DepartmentRowMapper());
    log.info("Department count is :{}",list.size());
    return list;
  }
}
