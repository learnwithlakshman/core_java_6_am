package com.careerit.cj.day5;

public class ContinueExample {

    public static void main(String[] args) {
        int n = 10;
        for(int i = 1, j = 1; j <=n; j++){
            if(j % 3 == 0){
                continue;
            }
            System.out.println(i+" "+j);
        }


    }
}
