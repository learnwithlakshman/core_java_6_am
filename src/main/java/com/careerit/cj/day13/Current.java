package com.careerit.cj.day13;

public class Current extends  Account {
    private double overdraft=10000;

    @Override
    public void withdraw(double amount) {
        if(amount <= (balance+overdraft)){
            this.balance -= amount;
        }else{
            System.out.println("Sorry! you don't sufficient funds your balance is :"+balance);
        }
    }
}
