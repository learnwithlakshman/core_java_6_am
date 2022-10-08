package com.careerit.cj.day21;

import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
class Product {
  private String name;
  private double price;


}

public class SetWithUserDefinedObject {

  public static void main(String[] args) {

    Product p1 = new Product("Dell", 350000);
    Product p4= new Product("Sony", 450000);
    Product p2 = new Product("Dell", 350000);
    Product p3 = p1;
    Set<Product> products = new HashSet<>();
    products.add(p1);
    products.add(p2);
    products.add(p3);
    products.add(p4);
    System.out.println(products.size());
  }
}
