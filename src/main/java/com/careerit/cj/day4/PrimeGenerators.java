package com.careerit.cj.day4;

import java.util.Scanner;

public class PrimeGenerators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lb value:");
        int lb = sc.nextInt();
        System.out.println("Enter the ub value :");
        int ub = sc.nextInt();
        printPrimes(lb, ub);
        int count = primeCount(lb,ub);
        System.out.println("Prime count between "+lb+" and "+ub+" is "+count);
        System.out.println("Enter the n value :");
        int n = sc.nextInt();
        generatePrimes(n);
    }
    private static void generatePrimes(int n){
        int count = 0;
        for (int i = 2;;i++) {
            if(isPrime(i)){
                count++;
                System.out.print(i+" ");
            }
            if(count == n){
                break;
            }
        }
    }
    private static void printPrimes(int lb,int ub){
        for (int i = lb; i <= ub; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static int primeCount(int lb,int ub){
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    private static boolean isPrime(int num) {
        if (num < 2 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

