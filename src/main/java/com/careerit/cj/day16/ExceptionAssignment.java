package com.careerit.cj.day16;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ExceptionAssignment {
    public static void main(String[] args) {

        int ccount = 0, ucount = 0;
        // Count of checked and un-checked exception
        List<Exception> exceptions = getExceptionList();
        for(Exception e:exceptions){
            if(e instanceof  RuntimeException){
                ucount++;
            }else{
                ccount++;
            }
        }
        System.out.println("Count of checked exceptions    :" + ccount);
        System.out.println("Count of un checked exceptions :" + ucount);
    }

    public static List<Exception> getExceptionList() {
        return List.of(new IOException(), new NullPointerException(), new ArrayIndexOutOfBoundsException(),
                new FileNotFoundException(), new StringIndexOutOfBoundsException(), new ClassCastException());
    }

}
