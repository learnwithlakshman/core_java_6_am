package com.careerit.cj.day11;


public class Calculator extends Object {
        MathOperations obj= new MathOperations();

        public int addNumbers(int a,int b){
                return obj.sum(a,b);
        }

        public int multiply(int a,int b,int c,int d){
                return obj.mul(a,b,c,d);
        }
}
