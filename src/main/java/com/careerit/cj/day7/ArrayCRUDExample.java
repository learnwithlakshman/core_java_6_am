package com.careerit.cj.day7;

class Container {

    private String[] arr;
    private int count = 0;
    public Container() {
        arr = new String[3];
    }

    public void add(String ele) {
        //find way how to increase array dynamically
        arr[count++] = ele;
    }

    public void remove(int index) {

    }

    public void showElements() {
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void replaceElement(int index, String value) {

    }

    public int indexOf(String ele) {
        return -1;
    }

    public String getElement(int index) {
        return null;
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
    }
}
