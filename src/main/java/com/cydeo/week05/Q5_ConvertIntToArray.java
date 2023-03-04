package com.cydeo.week05;

import java.util.Arrays;

public class Q5_ConvertIntToArray {

    public static void main(String[] args) {

     convertIntToArray(8900);


    }
    public static void convertIntToArray (int input){
        int [] num2 = Integer.toString(input).chars().map(n->n-'0').toArray();
        System.out.println(Arrays.toString(num2));
    }
}
