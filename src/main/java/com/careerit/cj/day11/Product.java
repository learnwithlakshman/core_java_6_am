package com.careerit.cj.day11;

public class Product {
     private int pid;
     private String name;
     private double price;

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }
    public void showDetails(){
        System.out.println("Pid    :"+pid);
        System.out.println("Pname  :"+name);
        System.out.println("Price  :"+price);

    }

    public void updatePrice(double discount){
        this.price = price - price * 0.1;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {

        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
