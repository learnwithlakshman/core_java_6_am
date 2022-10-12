package com.careerit.cj.pms.dao;

import com.careerit.cj.pms.domain.Product;
import com.careerit.cj.pms.util.ConnectionUtil;
import lombok.extern.slf4j.Slf4j;

import static com.careerit.cj.pms.dao.SQLQueryConstant.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ProductDaoImpl implements ProductDao {

  private ConnectionUtil connectionUtil;

  public ProductDaoImpl() {
    connectionUtil = ConnectionUtil.getInstance();
  }

  @Override
  public Product insertProduct(Product product) {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      con = connectionUtil.getConnection();
      st = con.prepareStatement(ADD_PRODUCT,Statement.RETURN_GENERATED_KEYS);
      st.setString(1, product.getName());
      st.setDouble(2, product.getDiscount());
      st.setDouble(3, product.getPrice());
      int res = st.executeUpdate();
      if(res==0){
          log.info("Product is not added/updated");
      }
      rs = st.getGeneratedKeys();
      if (rs.next()) {
        long productId = rs.getLong(1);
        product.setId(productId);
        log.info("Product is added with id :{}",productId);
      }
    } catch (SQLException e) {
      log.error("While adding product :{}", e);
      e.printStackTrace();
    } finally {
      connectionUtil.close(rs, st, con);
    }
    return product;
  }

  @Override
  public List<Product> selectProducts() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    List<Product> list = new ArrayList<>();
    try {
      con = connectionUtil.getConnection();
      st = con.createStatement();
      rs = st.executeQuery(ALL_PRODUCTS);
      while (rs.next()) {
        list.add(convertRowToProduct(rs));
      }
      log.info("Total {} products found in DB", list.size());
    } catch (SQLException e) {
      log.error("While getting products :{}", e);
    } finally {
      connectionUtil.close(rs, st, con);
    }
    return list;
  }

  private Product convertRowToProduct(ResultSet rs) throws SQLException {
    Product product = new Product();
    product.setId(rs.getLong("id"));
    product.setName(rs.getString("name"));
    product.setDiscount(rs.getDouble("discount"));
    product.setPrice(rs.getDouble("price"));
    return product;
  }

  @Override
  public List<Product> search(String str) {
    return null;
  }

  @Override
  public Product selectProduct(Long id) {
    return null;
  }

  @Override
  public boolean deleteProduct(Long id) {
    return false;
  }

  @Override
  public Product updateProduct(Product product) {
    return null;
  }
}
