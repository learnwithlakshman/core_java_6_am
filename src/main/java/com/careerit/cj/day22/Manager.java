package com.careerit.cj.day22;

import java.sql.*;

public class Manager {
  public static void main(String[] args) {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    try {
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "dbuser", "dbuser");
      st = con.createStatement();
      rs = st.executeQuery("select deptno, dname, loc from dept");
      while (rs.next()) {
        System.out.println(rs.getInt("deptno") + " - " + rs.getString("dname") + " - " + rs.getString("loc"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (rs != null)
          rs.close();
        if (st != null)
          st.close();
        if (con != null)
          con.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
