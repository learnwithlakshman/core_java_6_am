package com.careerit.cj.day17;

import java.io.IOException;

class OneException extends  Exception{ }
class TwoException extends  OneException{}

class ThreeException extends  TwoException{}


class One{
        void m1() throws OneException{

        }

}
class  Two extends  One{
        void m1()throws TwoException {

        }

}


public class ExceptionQuestions {
    public static void main(String[] args) {

    }
}
