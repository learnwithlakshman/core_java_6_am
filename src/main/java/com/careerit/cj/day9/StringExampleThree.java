package com.careerit.cj.day9;

import java.util.Locale;

public class StringExampleThree {
    public static void main(String[] args) {

        String name1 = "Hello Java";
        String name2 = name1.trim();

        System.out.println(name1.length());
        System.out.println(name2.length());

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());

        String name = "CoreJava";
        String firstName = name.substring(4);
        System.out.println(firstName);
        String data = " Hello Welcome to Java world";
        System.out.println(data.substring(0, 7).toUpperCase().trim().length());

        String names = "Krish, Manoj ,Charan , CV,Ramakrishna , Rajesh";
        String[] arr = names.split(",");
        for (String ele : arr) {
            String subName = ele.trim().length() >= 3 ? ele.trim().substring(0, 3).toUpperCase() : ele.trim().toUpperCase();
            System.out.println(subName);
        }

        String message = getMessageFromServer();
        if (message == null) {
            message = "\"Good morning\"";
        }
        System.out.println("Hello user, " + message.toUpperCase());

        String json = "{\n" +
                "   \"name\": \"Krish\",\n" +
                "   \"email\": \"krish@gmail.com\",\n" +
                "   \"age\": 37\n" +
                "\n" +
                "}";
        System.out.println(json);
    }

    private static String getMessageFromServer() {
        return "\"Welcome to java world\"";
    }
}
