package com.careerit.cj.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public class Manager {


  public static void main(String[] args) {
    showDeptDetails();
  }

  public static void showDeptDetails() {
    final String DEPT_DETAILS = "select deptno, dname, loc from dept";
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    ConnectionUtil connectionUtil = ConnectionUtil.getInstance();
    try{
      con = connectionUtil.getConnection();
      st = con.createStatement();
      rs=st.executeQuery(DEPT_DETAILS);
      while(rs.next()){
        int deptno = rs.getInt("deptno");
        String dname = rs.getString("dname");
        String loc = rs.getString("loc");
        String deptDetails = String.format("%s - %s - %s",deptno,dname,loc);
        log.info("{}",deptDetails);
      }
    }catch (SQLException e){
      log.info("While getting dept details :{}",e);
    }finally{
        connectionUtil.close(rs,st,con);
    }

  }

}
