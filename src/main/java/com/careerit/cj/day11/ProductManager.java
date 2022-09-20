package com.careerit.cj.day11;

public class ProductManager {
    public static void main(String[] args) {

        Product product = new Product(1001, "Lenovo Thinkpad", 75000);
        product.showDetails();
        product.updatePrice(0.01);
        product.showDetails();
        System.out.println(product.getPrice());
        String name = "Hello";
    }
}
