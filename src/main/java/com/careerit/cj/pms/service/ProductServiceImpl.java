package com.careerit.cj.pms.service;

import com.careerit.cj.pms.dao.ProductDao;
import com.careerit.cj.pms.dao.ProductDaoImpl;
import com.careerit.cj.pms.domain.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
  private ProductDao productDao;

  public ProductServiceImpl() {
    productDao = new ProductDaoImpl();
  }

  @Override
  public Product addProduct(Product product) {
    
    return null;
  }

  @Override
  public List<Product> getProducts() {
    return null;
  }

  @Override
  public List<Product> search(String str) {
    return null;
  }

  @Override
  public Product getProduct(Long id) {
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
