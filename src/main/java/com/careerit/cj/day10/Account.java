package com.careerit.cj.day10;

public class Account {

    private long accNumber;
    private String name;
    private double balance;

    public Account(long accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println("You acc number :" + maskAccNumber(accNumber) + " credited with amount " + amount + " has balance :" + balance);
        } else {
            System.out.println("Sorry! you don't have sufficient funds");
        }

    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("You acc number :" + maskAccNumber(accNumber) + " debited with amount " + amount + " has balance :" + balance);
    }

    public void showDetails() {
        System.out.println("Acc number :" + maskAccNumber(accNumber));
        System.out.println("Name       :" + name);
        System.out.println("Balance    :" + balance);
    }

    private String maskAccNumber(long accNumber) {
        String str = Long.valueOf(accNumber).toString();
        String maskedStr = "XX" + str.substring(str.length() - 3);
        return maskedStr;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
