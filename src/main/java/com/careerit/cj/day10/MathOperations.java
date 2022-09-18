package com.careerit.cj.day10;

public class MathOperations {

    int num1, num2;

    public MathOperations(float num1,float num2){

    }
    public MathOperations(int num1,float num2){

    }
    public MathOperations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public MathOperations(float num1,int num2){

    }

    public int add(){
        return num1 + num2;
    }
    public int sub(){
        return num1 > num2 ? num1 - num2 : num2 - num1;
    }

}
