package com.careerit.cj.day2;

import java.util.Scanner;

public class SICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p:");
        float p = sc.nextFloat();
        System.out.println("Enter the value of r:");
        float r = sc.nextFloat();
        System.out.println("Enter the value of t:");
        float t = sc.nextFloat();
        float si = (p * t * r)/100;
        System.out.println("Interest amount is:"+si);
    }
}
