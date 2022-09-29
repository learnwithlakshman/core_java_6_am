package com.careerit.cj.day15;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public class FunctionalInterfaceExample implements Serializable,Cloneable {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1, 101));
        }
        List<Integer> resultList = filteredData(list,(ele)->ele>20 && ele <=50);
        System.out.println(resultList);
    }
    public static List<Integer> filteredData(List<Integer> list, Predicate<Integer> predicate){
        List<Integer> filterList = new ArrayList<>();
        for(Integer ele:list){
            if(predicate.test(ele)){
                filterList.add(ele);
            }
        }
        return filterList;
    }


    public static List<Integer> getEvenNumber(List<Integer> list){
            List<Integer> evenList = new ArrayList<>();
            for(Integer ele:list){
                if(ele % 2==0){
                    evenList.add(ele);
                }
            }
            return evenList;
    };
    public static List<Integer> getOddNumber(List<Integer> list){
        List<Integer> oddList = new ArrayList<>();
        for(Integer ele:list){
            if(ele % 2!=0){
                oddList.add(ele);
            }
        }
        return oddList;
    };
    public static List<Integer> getGt5(List<Integer> list){
        List<Integer> gt5List = new ArrayList<>();
        for(Integer ele:list){
            if(ele > 5){
                gt5List.add(ele);
            }
        }
        return gt5List;
    };

}


