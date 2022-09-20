package com.careerit.cj.day11.packagea;

public class C {
    A obj = new A();
    public void show(){
        System.out.println("Public    :"+obj.b);
        System.out.println("Protected :"+obj.c);
        System.out.println("Default   :"+obj.d);
      //System.out.println("Private   :"+obj.a);
    }
}
