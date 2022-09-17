package com.careerit.cj.day9;

public class StringExampleTwo {
    public static void main(String[] args) {

        String name = "Corejava";

        System.out.println(name.length());
        System.out.println(name.charAt(0));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }

    }

    private static boolean isPalindrome(String str) {
        /*String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr.equals(str);*/

        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeWithSb(String str) {
       return new StringBuilder(str).reverse().toString().equals(str);
    }

}
