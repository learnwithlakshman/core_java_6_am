package com.careerit.cj.day2;

import java.util.Scanner;

public class BoxCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int count = sc.nextInt();
        System.out.println("Enter the capacity:");
        int capacity = sc.nextInt();
        int requiredBoxCount = 0;
        if(count > capacity){
            if(count % capacity == 0){
                requiredBoxCount = count/capacity;
            }else{
                requiredBoxCount = (count/capacity)+1;
            }
        }else{
            requiredBoxCount = 1;
        }
        System.out.println("Required boxes count is :"+requiredBoxCount);
    }
}
