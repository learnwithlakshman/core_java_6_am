package com.careerit.cj.day17;

import com.careerit.cj.day11.packagea.A;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Calc {
    double apply(double num1, double num2);
}

class MathOperations {
    public double perform(double num1, double num2, Calc calc) {
        return calc.apply(num1, num2);
    }
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}


public class FunctionInterfaceExample {

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        double res = obj.perform(30, 70, (num1, num2) -> num1 + num2);
        System.out.println(res);

        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> oddNumbers = filter(numList, (num) -> num % 2 != 0);
        List<Integer> evenNumbers = filter(numList, (num) -> num % 2 == 0);
        List<Integer> gt5 = filter(numList, (num) -> num > 5);
    }

    public static List<Integer> filter(List<Integer> list, MyPredicate myPredicate) {
        List<Integer> filteredList = new ArrayList<>();
        for(Integer ele:list){
                if(myPredicate.test(ele)){
                    filteredList.add(ele);
                }
        }
        return filteredList;
    }

}
