package com.careerit.cj.day17;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account extends Object {

    private long accountNumber;
    private String name;
    private double balance;

    public void withdraw(double amount){
            if(amount > balance){
                 throw new InsufficientFundsException("You don't sufficient balance and your balance is "+balance);
            }
            balance -=amount;
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
