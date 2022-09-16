package com.careerit.cj.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(1003));

        for (int i = 0; i < list.size(); i++) {
            int ele = list.get(i);
            System.out.println(ele);
        }
        for(int ele:list){
            System.out.println(ele);
        }
        // byte -> Byte
        // int  -> Integer

    }
}
