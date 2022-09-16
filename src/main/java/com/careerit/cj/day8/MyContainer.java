package com.careerit.cj.day8;

import java.util.ArrayList;
import java.util.List;

public class MyContainer {

    List<String> list = new ArrayList<>();
    public MyContainer() {

    }

    public void add(String ele) {
        list.add(ele);

    }

    public void remove(int index) {
            list.remove(index);
    }

    public void showElements() {
        for(String ele:list){
            System.out.println(ele);
        }
    }

    public void replaceElement(int index, String value) {
            list.set(index,value);
    }

    public int indexOf(String ele) {
            return list.indexOf(ele);
    }

    public String getElement(int index) {
            return list.get(index);
    }



}
