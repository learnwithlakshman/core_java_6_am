package com.careerit.cj.day4;

import java.util.Scanner;

public class FirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        System.out.println("-".repeat(20));
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
