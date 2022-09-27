package com.careerit.cj.day14;

abstract class One {
    void m1() {
        System.out.println("M1 of One");
    }
    abstract void m2();
    abstract void m3();
}

abstract class Two extends One {
    @Override
    void m2() {
        System.out.println("M2 of Two");
    }
}
class Three extends  Two{

    @Override
    void m3() {
        System.out.println("M2 of Two");
    }
}

abstract class C1{
    C1(){
        super();
        System.out.println("C1");
    }
}
class C2 extends  C1{
    C2(){
        super();
        System.out.println("C2");
    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        C1 obj = new C2();
    }
}
