package com.careerit.cj.day7;

import java.lang.reflect.Array;
import java.util.Arrays;

class Container {

    private String[] arr;
    private int count = 0;

    public Container() {
        arr = new String[3];
    }

    public void add(String ele) {
        if (count >= arr.length){
            String[] temp = new String[arr.length+3];
            System.arraycopy(arr,0,temp,0,arr.length);
            arr = temp;
        }
        arr[count++] = ele;

    }

    public void remove(int index) {

    }

    public void showElements() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void replaceElement(int index, String value) {
            if(index <=count ){
                arr[index] = value;
            }
            throw new ArrayIndexOutOfBoundsException("Out of range index");
    }

    public int indexOf(String ele) {
        return -1;
    }

    public String getElement(int index) {
        return null;
    }

    public int[] copyElements(int[] a,int[] b){
           int[] arr = new int[a.length+b.length];
           System.arraycopy(a,0,arr,0,a.length);
           System.arraycopy(b,0,arr,a.length,b.length);
           return arr;
    }

}

public class ArrayCRUDExample {
    public static void main(String[] args) {
        Container obj = new Container();
        obj.add("Manoj");
        obj.add("Charan");
        obj.add("Balu");
        obj.add("Rajesh");
        obj.showElements();

        System.out.println(Arrays.toString(obj.copyElements(new int[]{1,2,3},new int[]{4,5,6,7})));


    }
}
