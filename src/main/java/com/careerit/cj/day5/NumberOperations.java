package com.careerit.cj.day5;

public class NumberOperations {

        public static void main(String[] args) {
                int num = 1291;
                System.out.println("Sum of digits of "+num+" is "+sumOfDigits(num));
                System.out.println("Reverse of "+num+" is "+reverse(num));
                System.out.println(num+ " is Palindrome ? "+isPalindrome(num));
        }
        private static int sumOfDigits(int num){
               int sum = 0;
               while(num != 0 ){
                       int r = num % 10;
                       sum += r;
                       num /= 10;
               }
               return sum;
        }
        private static boolean isPalindrome(int num){
                return num == reverse(num);
        }
        private static int reverse(int num){
                int rev = 0;
                while(num != 0 ){
                        int r = num % 10;
                        rev = rev * 10 + r;
                        num /= 10;
                }
                return rev;
        }
}
