package com.careerit.cj.pms.dao;

import com.careerit.cj.pms.domain.Product;
import com.careerit.cj.pms.exception.ProductException;
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

  @Override
  public List<Product> search(String str) {
    Connection con=null;
    PreparedStatement st = null;
    ResultSet rs = null;
    List<Product> list = new ArrayList<>();
    try{
      con = connectionUtil.getConnection();
      st = con.prepareStatement(SEARCH_PRODUCT);
      String searchStr = "%"+str+"%";
      st.setString(1,searchStr);
      log.info("Statement :{}",st);
      rs = st.executeQuery();
      while (rs.next()) {
        list.add(convertRowToProduct(rs));
      }
      log.info("Search result has {} products", list.size());

    }catch (SQLException e){
      log.error("While searching product :"+e);
    }finally {
      connectionUtil.close(rs,st,con);
    }
    return list;
  }

  @Override
  public Product selectProduct(Long id) {
    Connection con=null;
    PreparedStatement st = null;
    ResultSet rs = null;
    try{
        con = connectionUtil.getConnection();
        st = con.prepareStatement(GET_PRODUCT);
        st.setLong(1,id);
        rs = st.executeQuery();
        if(rs.next()){
            log.info("Product found for the given id "+id);
            return convertRowToProduct(rs);
        }
    }catch (SQLException e){
        log.error("While getting product by id :"+e);
    }finally {
        connectionUtil.close(rs,st,con);
    }
    throw new ProductException("Product with id "+id+" is not found");
  }

  @Override
  public boolean deleteProduct(Long id) {
    Connection con=null;
    PreparedStatement st = null;
    ResultSet rs = null;
    try{
      con = connectionUtil.getConnection();
      st = con.prepareStatement(DELETE_PRODUCT);
      st.setLong(1,id);
      int res = st.executeUpdate();
      if(res!=0){
        log.info("Product with id {} is deleted",id);
        return true;
      }
    }catch (SQLException e){
      log.error("While getting product by id :"+e);
    }finally {
      connectionUtil.close(rs,st,con);
    }
    throw new ProductException("Product with id "+id+" is not found");
  }

  @Override
  public Product updateProduct(Product product) {
    Connection con = null;
    PreparedStatement st = null;
    try {
      con = connectionUtil.getConnection();
      st = con.prepareStatement(UPDATE_PRODUCT);
      st.setString(1, product.getName());
      st.setDouble(2, product.getDiscount());
      st.setDouble(3, product.getPrice());
      st.setLong(4,product.getId());
      int res = st.executeUpdate();
      if(res!=0){
          log.info("Product with id {} is updated",product.getId());
          return product;
      }
    } catch (SQLException e) {
      log.error("While adding product :{}", e);
      e.printStackTrace();
    } finally {
      connectionUtil.close(st, con);
    }
    throw new ProductException("Product with id "+product.getId()+" was not able update");
  }

  private Product convertRowToProduct(ResultSet rs) throws SQLException {
    Product product = new Product();
    product.setId(rs.getLong("id"));
    product.setName(rs.getString("name"));
    product.setDiscount(rs.getDouble("discount"));
    product.setPrice(rs.getDouble("price"));
    return product;
  }
}
