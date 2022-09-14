package com.careerit.cj.day6;

public class ArrayOperations {


    //Check sub set or not
    private static boolean checkSubSet(int[] big,int[] small){
        return false;
    }


    // Generate n prime numbers
    private static int[] generatePrime(int n){
        return null;
    }


    // If key found then return index otherwise return -1
    private static int linearSearch(int[] arr, int key) {
        for(int i=0;i<arr.length;i++){
                int ele = arr[i];
                if(ele == key){
                    return i;
                }
        }
        return -1;
    }

    //Find biggest element
    private static int biggest(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        return big;
    }

    //Find smallest element
    private static int smallest(int[] arr) {
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;
    }

    // Return sum of all the elements
    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

}
