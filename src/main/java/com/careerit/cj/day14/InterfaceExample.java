package com.careerit.cj.day14;

import java.time.LocalDateTime;

interface MathOperations {
    boolean isPrime(int num);

    boolean gcd(int num1, int num2);

    boolean isPalindrome(int num);

    default int countPrime(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static int getCurrentMonth() {
        return LocalDateTime.now().getMonth().getValue();
    }

    private int getCurrentYear() {
        return LocalDateTime.now().getYear();
    }

}


class MyMathOperations implements MathOperations {
    @Override
    public boolean isPrime(int num) {
        return false;
    }

    @Override
    public boolean gcd(int num1, int num2) {
        return false;
    }

    @Override
    public boolean isPalindrome(int num) {
        return false;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println(MathOperations.getCurrentMonth());

        MathOperations obj = new MyMathOperations();
        System.out.println(obj.countPrime(10,20));
    }
}
