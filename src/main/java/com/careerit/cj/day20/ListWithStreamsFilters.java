package com.careerit.cj.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListWithStreamsFilters {

  public static void main(String[] args) {
    //Predicate<Integer> predicate = ele -> ele % 2 == 0;
  }

  private static List<Integer> getEvenNumbers(List<Integer> list) {
//    List<Integer> evenList = new ArrayList<>();
//    for (Integer num:list) {
//      if (num % 2 == 0) {
//        evenList.add(num);
//      }
//    }
//    return evenList;
    return list.stream()
        .filter(ele -> ele % 2 == 0)
        .collect(Collectors.toList());
  }

  private static List<String> getNamesStartsLetterA(List<String> list) {
//      List<String> filteredNamesList = new ArrayList<>();
//      for(String name:list){
//          if(name.toLowerCase().startsWith("a")){
//              filteredNamesList.add(name);
//          }
//      }
//      return filteredNamesList;
    List<String> filteredNamesList =
        list.stream().filter(ele -> ele.toLowerCase().startsWith("a")).collect(Collectors.toList());
    return filteredNamesList;
  }

  //["Krish","Manoj","Charan"]->[5,5,6]
  private static List<Integer> getNamesLength(List<String> list) {
//        List<Integer> numList = new ArrayList<>();
//        for(String name:list){
//            numList.add(name.length());
//        }
//        return numList;
    return list.stream()
        .map(ele -> ele.length())
        .collect(Collectors.toList());
  }


}
