package com.careerit.cj.day7;

public class Arraywith2D {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1}
        };

        /*for (int i = 0; i < arr.length; i++) {
              for(int j=0;j<arr[i].length;j++){
                  if(arr[i][j] == 0) {
                      System.out.print("   ");
                  }else{
                      System.out.print(" * ");
                  }
              }
            System.out.println();
        }*/
        for(int[] a:arr){
            for(int i:a){
                if(i == 0) {
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        String[][] names = new String[][]{{"Krish","Manoj","Charan"},{"Kiran","Balu","Rajesh"}};
        for(String[] name:names){
            for(String ele:name){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
