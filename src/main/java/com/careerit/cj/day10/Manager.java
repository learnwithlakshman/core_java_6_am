package com.careerit.cj.day10;

public class Manager {

    public static void main(String[] args) {

        Account acc1 = new Account(1008800891,"Krish",34500);
        Account acc2 = new Account(1008800899,"Manoj",500000);
        Account acc3 = new Account(1008800851,"Charan",340500);
        Account acc4 = new Account(1008700851,"Prasanth",1340500);
        Account acc5 = new Account(1008800851,"Kishore",2340500);

        Account[] arr = new Account[]{acc1,acc2,acc3,acc4,acc5};

        double totalAmount=0;
        for(Account account:arr){
                totalAmount += account.getBalance();
        }
        System.out.println(totalAmount);

/*
        MathOperations obj = new MathOperations(20,30);
        System.out.println(obj.add());
        System.out.println(obj.sub());
*/


    }
}
