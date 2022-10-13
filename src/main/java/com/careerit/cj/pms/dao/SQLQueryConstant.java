package com.careerit.cj.pms.dao;

public final class SQLQueryConstant {
  private SQLQueryConstant(){}

  public static final String ALL_PRODUCTS="SELECT id, name, discount, price FROM product";
  public static final String ADD_PRODUCT="INSERT INTO product(name,discount,price) VALUES(?,?,?)";
  public static final String GET_PRODUCT="SELECT id, name, discount, price FROM product WHERE id = ?";
  public static final String SEARCH_PRODUCT="SELECT id, name, discount, price FROM product WHERE name LIKE ?";
  public static final String DELETE_PRODUCT="DELETE FROM product WHERE id = ?";
  public static final String UPDATE_PRODUCT="UPDATE product set name=?,discount=?,price=? where id=?";

}
