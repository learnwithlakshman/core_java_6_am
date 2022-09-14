package com.careerit.cj.day6;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+(i+1)+" value");
            arr[i] = sc.nextInt();
        }

        showElementsUsingForloop(arr);
        showElementsUsingForEach(arr);

    }
    // Using for loop
    private static void showElementsUsingForloop(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // Using for loop each
    private static void showElementsUsingForEach(int[] arr){
        for(int ele: arr ){
            System.out.print(ele+" ");
        }
    }
}
