package com.careerit.cj.day11.packageb;

import com.careerit.cj.day11.packagea.A;

public class E {

    A obj = new A();
    public void show(){
        System.out.println("Public    :"+obj.b);
        //System.out.println("Protected :"+obj.c);
        //System.out.println("Default   :"+obj.d);
        //System.out.println("Private   :"+obj.a);
    }
}
