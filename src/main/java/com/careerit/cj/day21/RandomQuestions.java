package com.careerit.cj.day21;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class RandomQuestions {
  public static void main(String[] args) {
    // Question bank 1 to 200
     Set<Integer> set = new HashSet<>();
     while(set.size()!=20) {
       int num = ThreadLocalRandom.current().nextInt(1, 101);
       set.add(num);
     }
    System.out.println(set);
  }
}
