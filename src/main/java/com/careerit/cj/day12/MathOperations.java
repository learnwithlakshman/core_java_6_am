package com.careerit.cj.day12;

import static java.lang.Math.*;
import static java.lang.System.out;
import static com.careerit.cj.day12.UserDbQueries.*;
final class Calc {
    private Calc() {
    }

    public static double power(int m, int n) {
        return Math.pow(m, n);
    }

}

public class MathOperations {

    public static void main(String[] args) {
        double res = Calc.power(2, 3);
        out.println(res);out.println(sqrt(9));
        out.println(pow(2, 3));
        out.println(PI);
        out.println(ALL_USERS);
        out.println(GET_USER_BY_STATUS);
    }
}

