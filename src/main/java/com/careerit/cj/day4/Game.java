package com.careerit.cj.day4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static void main(String[] args) {
        int gnum = ThreadLocalRandom.current().nextInt(1, 7);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name :");
        String name = sc.nextLine();
        boolean flag = true;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess number it should be (1-6) only :");
            int num = sc.nextInt();
            if (num == gnum) {
                System.out.println("Hi "+name+", Good you guessed number in " + i + " attempts");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Sorry! you have reached max number of attempts, try again... the number is :"+gnum);
        }

    }
}
