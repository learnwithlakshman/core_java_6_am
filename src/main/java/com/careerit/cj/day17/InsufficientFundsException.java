package com.careerit.cj.day17;

public class InsufficientFundsException extends  RuntimeException {

    private final String message;
    public InsufficientFundsException(){
        message = "You don't have sufficient balance to withdraw, please check balance";
    }

    public InsufficientFundsException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InsufficientFundsException{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
