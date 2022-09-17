package com.careerit.cj.day9;

public class ConstructHTMLPapge {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>");
        sb.append("\n<html lang=\"en\">");
        sb.append("\n<head>");
        sb.append("\n\t<title>Welcome message</title>");
        sb.append("\n</head>");
        sb.append("\n<body>");
        sb.append("\nHello %s, \n\n\t\t Welcome to SSBA, have a great day! ");
        sb.append("\n</body>");
        sb.append("\n</html>");
        String [] names = {"Krish","Manoj","Rajesh"};

        for(String name:names){
            String email = String.format(sb.toString(),name);
            System.out.println(email);
            System.out.println("-".repeat(100));
        }

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
