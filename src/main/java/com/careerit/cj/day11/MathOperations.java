package com.careerit.cj.day11;

import java.io.IOException;

public class MathOperations {

    public int sum(int a, int b) {
        System.out.println("Sum of two number");
        return a + b;
    }
    public int sum(int a, int b, int c) {
        System.out.println("Sum of three numbers");
        return a + b + c;
    }

    public int sum(int... arr) {
        System.out.println("Sum of n numbers");
        int res = 0;
        for (int ele : arr) {
            res += ele;
        }
        return res;
    }

    public int mul(int a, int b) {
        System.out.println("Mul of two number");
        return a * b;
    }
    public int mul(int a, int b, int c) {
        System.out.println("Mul of three numbers");
        return a * b * c;
    }

    public int mul(int... arr) {
        System.out.println("Mul of n numbers");
        int res = 0;
        for (int ele : arr) {
            res *= ele;
        }
        return res;
    }

}
