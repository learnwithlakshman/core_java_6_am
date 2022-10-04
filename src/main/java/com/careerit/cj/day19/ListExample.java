package com.careerit.cj.day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListExample {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println("---- using for each----------");
    for (Integer ele : list) {
      System.out.println(ele);
    }
    System.out.println("------ using streams-----------");
    list.stream().forEach(ele->System.out.println(ele));
    list.remove(Integer.valueOf(3));
    System.out.println(list);
    List<Integer> subList = list.subList(2,4);
    System.out.println(subList);

    List<Integer> evenList = List.of(10,20,30,40);
    List<Integer> oddList = List.of(11,21,31,41);

    List<Integer> numList = new ArrayList<>();
    numList.addAll(evenList);
    numList.addAll(oddList);

    System.out.println(numList);
    int key = 21;
    if(numList.contains(key)){
      System.out.println("Found");
    }else{
      System.out.println("Not found");
    }

    if(numList.containsAll(evenList)){
      System.out.println("Found");
    }else{
      System.out.println("Not found");
    }

    System.out.println(numList.indexOf(21));
    // Iterator and List Iterator

    Iterator<Integer> iterator = numList.iterator();
    System.out.println(numList);
    while(iterator.hasNext()){
        Integer ele = iterator.next();
        System.out.println(ele);
        if(ele % 2 == 0 && ele % 8 == 0){
          iterator.remove();
        }
    }
    System.out.println(numList);

    iterator.forEachRemaining(ele->{
        System.out.println(ele);
    });
    System.out.println("After remove of all elements:"+numList);
    ListIterator<Integer> listItr = numList.listIterator();
    while(listItr.hasNext()){
        Integer ele = listItr.next();
        if(ele==20){
          listItr.set(200);
        }
        if(ele==30){
          listItr.add(33);
        }
    }
    while(listItr.hasPrevious()){
      Integer ele=listItr.previous();
      System.out.println(ele);
    }
    System.out.println(numList);
  }
}
