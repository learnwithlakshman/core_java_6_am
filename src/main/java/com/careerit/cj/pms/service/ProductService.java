package com.careerit.cj.pms.service;

import com.careerit.cj.pms.domain.Product;

import java.util.List;

public interface ProductService {

  Product addProduct(Product product);

  List<Product> getProducts();

  List<Product> search(String str);

  Product getProduct(Long id);

  boolean deleteProduct(Long id);

  Product updateProduct(Product product);

}
