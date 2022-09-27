package com.careerit.cj.day13;

public class Savings extends  Account{
    private double minBalance=1000;


    public void withdraw(double amount) {
        if(amount <= (balance-minBalance)){
            this.balance -= amount;
        }else{
            System.out.println("Sorry! you don't sufficient funds your balance is :"+balance);
        }
    }
}
