package com.cydeo.week05;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Q2_FindFactorialNumber {
    public static void main(String[] args) {

        System.out.println(FindFactorialNumber(6));

    }


    private static Long FindFactorialNumber (long n){
        return LongStream.rangeClosed(1,n).reduce((x,y)->x*y).getAsLong();

    }

}
