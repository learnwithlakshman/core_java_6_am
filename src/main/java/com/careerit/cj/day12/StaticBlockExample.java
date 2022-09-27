package com.careerit.cj.day12;

class DbConnection{
    static{
        System.out.println("Connecting with database");
    }

}
public class StaticBlockExample {
    static{
        System.out.println("Main static block");
    }
    public static void main(String[] args) {
        DbConnection obj = new DbConnection();
        System.out.println("Main method");
    }
}
