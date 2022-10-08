package com.careerit.cj.day21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetAssignmentQuestion {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for(int i=1;i<=50;i++){
        list.add(ThreadLocalRandom.current().nextInt(1,200));
    }
    // Get all unique even number

    // Get all numbers which are > 10 and < 50 should be unique


    // Get all unique element and double each element and display


  }
}
