package com.cydeo.week07;

import java.util.Arrays;

public class Q1_MissingNumber {
    public static void main(String[] args) {

        int [] num = {0, 1};
        int [] num1 = {3, 0, 1};
        int [] num2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(MissingNumber_Sopo(num));
        System.out.println(MissingNumber_Sopo(num1));
        System.out.println(MissingNumber_Sopo(num2));


    }
    public static int MissingNumber_Sopo (int [] number){
        int n = number.length;
        int sum = n* (n+1)/2; //This calculates sum from 0 to n number. e. g 0-5 the sum is 15 and the same is giving this method.
                                //5*(5+1)/2 = 15

        for (int i = 0; i < n; i++) {
            sum -=number[i];

        }

        return sum;
    }
}
