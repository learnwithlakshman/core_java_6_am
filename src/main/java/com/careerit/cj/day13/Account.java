package com.careerit.cj.day13;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account extends Object {

     long accountNumber;
     String name;
     double balance;

    public void withdraw(double amount){
            if(amount <= balance){
                this.balance -= amount;
            }else{
                System.out.println("Sorry! you don't sufficient funds your balance is :"+balance);
            }
    }
    public void deposit(double amount){
            this.balance +=amount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && Double.compare(account.balance, balance) == 0 && name.equals(account.name);
    }
     @Override
    public int hashCode() {
        return Objects.hash(accountNumber, name, balance);
    }
}
