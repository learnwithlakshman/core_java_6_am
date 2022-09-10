package com.careerit.cj.day2;


import java.util.Scanner;

public class SumAndAvgOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        float avg = sum / 3.0f;
        System.out.println("The sum is :" + sum);
        System.out.println("The Avg is :" + avg);
    }
}
