package com.careerit.cj.day16;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            int value = getNumber();
            System.out.println(value);
        }catch (NullPointerException e){
                System.out.println("Exception " + e);
        }finally{
            System.out.println("Finally");
        }
        System.out.println("End of main method");
    }

    private static int getNumber() {
        return Integer.parseInt("12A");
    }
}
