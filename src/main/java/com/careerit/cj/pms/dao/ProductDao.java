package com.careerit.cj.pms.dao;

import com.careerit.cj.pms.domain.Product;

import java.util.List;

public interface ProductDao {

  Product insertProduct(Product product);

  List<Product> selectProducts();

  List<Product> search(String str);

  Product selectProduct(Long id);

  boolean deleteProduct(Long id);

  Product updateProduct(Product product);

}
