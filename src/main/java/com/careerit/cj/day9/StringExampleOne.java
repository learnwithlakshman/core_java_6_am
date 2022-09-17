package com.careerit.cj.day9;

public class StringExampleOne {
    public static void main(String[] args) {

        String name1 = "Core Java";
        String name2 = "Core";
        name2 = name2.concat(" Java");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        String name3 = new String("Core Java");
        String name4 = new String("Core Java");

        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));

    }
}
