package com.careerit.cj.day16;

public class ExceptionExample3 {

    public static void main(String[] args) {

    }
    public static int div(int num1,int num2){
        if(num2==0){
            throw new ArithmeticException("num2 can't be zero");
        }
        return num1/num2;
    }
}
