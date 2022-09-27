package com.careerit.cj.day12;

class Product{
    int pid;
    String name;
    double price;
    private static int count = 0;
    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        count++;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public static int getCount(){
        return count;
    }
}
public class ProductManager {
    public static void main(String[] args) {
        System.out.println(Product.getCount());
        Product p1 = new Product(1001,"HP Notebook",67000);
        Product p2 = new Product(1021,"HP SuperSlimBook",68000);
        Product p3 = new Product(1031,"Lenovo Thinkpad",87000);
        System.out.println(Product.getCount());

        System.out.println(p1);
    }

    static class Inner{

    }
}
