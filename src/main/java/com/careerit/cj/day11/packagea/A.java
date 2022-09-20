package com.careerit.cj.day11.packagea;

public class A {

    private int a = 10;
    public int b = 20;
    protected int c = 30;
    int d = 40;

    public void show(){
        System.out.println("Public    :"+b);
        System.out.println("Protected :"+c);
        System.out.println("Default   :"+d);
        System.out.println("Private   :"+a);
    }

}
