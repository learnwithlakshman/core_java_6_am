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
    product.setId(4L);
    product.setName("Sony Notebook");
    product.setDiscount(5000);
    product.setPrice(600000);
    productDao.updateProduct(product);
  }
}
