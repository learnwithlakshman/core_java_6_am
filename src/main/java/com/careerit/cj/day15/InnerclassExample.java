package com.careerit.cj.day15;

import com.careerit.cj.day11.packagea.A;

import java.util.function.IntBinaryOperator;

abstract class One {
    abstract void m1();
}

class Two extends One {
    public void m1() {
        System.out.println("M1 of Two");
    }

}

public class InnerclassExample {

    public class Inner {

    }

    void showInformation() {
        class MethodInner {

        }
    }

    public static void main(String[] args) {
        One obj = new One() {
            @Override
            void m1() {
                System.out.println("M1");
            }
        };
        obj.m1();

        Calc ref = (a, b) -> a + b;
        System.out.println(ref.perform(1, 2));
        ref = (a, b) -> a * b;
        System.out.println(ref.perform(2, 5));

        MyPredicate evenPredicate = (num) -> num % 2 == 0;

        int[] arr = new int[]{1, 2, 3, 4, 5};
        showResult(arr, (left, right) -> left + right);
        showResult(arr, (left, right) -> left * right);

    }

    public static void showResult(int[] arr, IntBinaryOperator obj) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = obj.applyAsInt(res, arr[i]);
        }
        System.out.println("Result :" + res);
    }

}

// Functional interface
@FunctionalInterface
interface Calc {
    int perform(int a, int b);

}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

