package com.careerit.ems.dao;

import com.careerit.ems.domain.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DepartmentDaoTest {

  @Autowired
  private DepartmentDao departmentDao;

  @Test
  void getDepartments() {
    List<Department> list = departmentDao.getDepartments();
    Assertions.assertEquals(4, list.size());
  }

}
