package com.careerit.cj.pms;

import com.careerit.cj.pms.dao.ProductDao;
import com.careerit.cj.pms.dao.ProductDaoImpl;
import com.careerit.cj.pms.domain.Product;
import com.careerit.cj.pms.util.ConnectionUtil;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.util.List;

@Slf4j
public class Main {

  public static void main(String[] args) {

    ProductDao productDao = new ProductDaoImpl();

    Product product = new Product();
    product.setName("Sony Super Note");
    product.setDiscount(2000);
    product.setPrice(560000);
    productDao.insertProduct(product);
  }
}
