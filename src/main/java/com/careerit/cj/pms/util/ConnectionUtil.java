package com.careerit.cj.pms.util;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;


@Slf4j
public class ConnectionUtil {

  private static ConnectionUtil obj = null;
  private static Properties properties;

  private ConnectionUtil() {
  }

  static {
    properties = new Properties();
    try {
      properties.load(ConnectionUtil.class.getResourceAsStream("/application.properties"));
    } catch (IOException e) {
      log.error("While loading properties {}", e);
    }
  }

  public Connection getConnection() {
    Connection con = null;
    try {
      con = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.username"), properties.getProperty("db.password"));
      log.info("Connection with db is successful");
    } catch (SQLException e) {
      log.error("While connecting with database :{}", e);
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
      log.error("While closing with database {}", e);
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
      log.error("While closing with database : {}", e);
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
