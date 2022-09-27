package com.careerit.cj.day12;


import com.careerit.cj.day11.packagea.C;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AreaOfCircle{

    private final double r;

    public AreaOfCircle(double r) {
        this.r = r;
    }

}


 class C1{
   public  void m1() throws IOException {
        System.out.println("C1 Of M1");
    }

}
class C2 extends  C1{
    public void m1(){

    }
}



public class FinalkeywordExample {

    public static void main(String[] args) {
        final int WORK_DAYS = 5;
        C2 obj = new C2();


    }
}
