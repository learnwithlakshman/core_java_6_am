package com.careerit.cj.day4;

import java.util.Scanner;

public class NestedForLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // For loop which print ( )
         /* 5 4 3 2 1
            4 3 2 1
            3 2 1
            2 1
            1*/

        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
