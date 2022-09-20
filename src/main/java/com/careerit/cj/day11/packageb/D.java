package com.careerit.cj.day11.packageb;

import com.careerit.cj.day11.packagea.A;

public class D extends A {

    public void show() {
        System.out.println("Public    :" + b);
        System.out.println("Protected :" + c);
        //System.out.println("Default   :" + d);
        //System.out.println("Private   :"+a);
    }
}
