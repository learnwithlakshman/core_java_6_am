package com.careerit.cj.jdbc;
import java.sql.*;
import java.util.logging.Logger;


public class ConnectionUtil {
  private Logger log = Logger.getLogger(ConnectionUtil.class.getName());
  private  static ConnectionUtil obj = null;

  private ConnectionUtil() {
  }

  public Connection getConnection() {
    String url = "jdbc:postgresql://localhost:5432/mydb";
    String username = "dbuser";
    String password = "dbuser";
    Connection con = null;
    try {
      con = DriverManager.getConnection(url, username, password);
      log.info("Connection with db is successful");
    } catch (SQLException e) {
      log.info("While connecting with database :{}"+e);
    }
    return con;
  }

  public void close(ResultSet rs, Statement st, Connection con) {
    try {
      if (st != null) {
        st.close();
      }
      if (con != null) {
        con.close();
      }
      if (rs != null) {
        rs.close();
      }
    } catch (SQLException e) {
      log.info("While closing with database {}"+e);
    }
  }

  public void close(Statement st, Connection con) {
    try {
      if (st != null) {
        st.close();
      }
      if (con != null) {
        con.close();
      }
    } catch (SQLException e) {
      log.info("While closing with database : {}"+e);
    }
  }
  public static ConnectionUtil getInstance() {
     synchronized (ConnectionUtil.class) {
        if (obj == null) {
          obj = new ConnectionUtil();
        }
    }
    return obj;
  }

}
