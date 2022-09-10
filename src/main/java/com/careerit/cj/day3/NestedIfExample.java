package com.careerit.cj.day3;

import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        if(num > 0){
            if(num % 2 == 0){
                System.out.println(num+" is even");
            }else{
                System.out.println(num+" is odd");
            }
        }else{
            System.out.println(num+" is negative number");
        }
        System.out.println("End of main method");
    }
}
